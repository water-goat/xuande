package CommandTest;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class StringformatTest {
    public static void main(String[] args) {
        String name="张三";
        Set<String> hs = new HashSet<>();
        hs.add("李四");
        hs.add("王五");
        System.out.println(String.format("成员姓名：%s", name));
        for (String h : hs) {
            System.out.println(String.format("成员姓名：%s",h ));
        }
         int a='苹' + '果';
        System.out.println(a);
        System.out.println((short) 10 + 'a');

    }
    public void output() throws NullPointerException{
        HashSet set=null;
        set.add("nihao");
    }
}