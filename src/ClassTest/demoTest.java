package ClassTest;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

public class demoTest {

    public static void main(String[] args) throws Exception{

        /**
         * 获取Class类的三种方法,一个类只能有一个Class对象
         */
        //类名.class
        Class aClass = Students.class;
        //对象.getClass()
        Students stu=new Students();
        Class aClass1 = stu.getClass();
        //Class.forName("类在包中的位置")
        Class aClass2 = Class.forName("ClassTest.Students");
        //补充，基本数据类型的封装类可以用   类名.TYPE
        Class aClass3 = Integer.TYPE;

        /**
         * 用Class类中的方法可以新建一个object类的对象，然后可以强转成原类的对象
         * newInstance()
         */
        Object o1 = aClass1.newInstance();
        Students students =(Students)o1;
        System.out.println(students);
        /**
         * 获取类中的构造方法并使用
         */
        Constructor constructor = aClass1.getConstructor(int.class,String.class);
        Object o2 = constructor.newInstance( 18,"张三");
        System.out.println(o2);
        /**
         * 获取原类的成员变量,非public的成员变量必须用getDeclaredField()才能正常获取
         */
        Field age = aClass1.getDeclaredField("age");
        System.out.println(age.isAccessible());
        age.setAccessible(true);
        age.set(o1,20);
        System.out.println(o1);
        /**
         * 利用反射擦除泛型
         */
        List<String> list=new ArrayList<>();
        list.add("字符串");
        Method method = list.getClass().getMethod("add",Object.class);
        method.invoke(list,110);
        for (Object s : list) {
            System.out.println(s);
        }

    }
}
