package AnnotationTest;

import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws NoSuchMethodException {
        Class<Service1> service1Class = Service1.class;
        Method method = service1Class.getMethod("method1");
        if (method.isAnnotationPresent(Annotation1.class)){
            System.out.println("Service1已添加@Annotation1注解");
            Annotation1 annotation = method.getAnnotation(Annotation1.class);
            System.out.println(annotation.value());
            System.out.println(annotation.version());
        }else {
            System.out.println("Service1未添加@Annotation1注解");
        }

        Class<Service11> service11Class = Service11.class;
        Method method11 = service11Class.getMethod("method1");
        if (method11.isAnnotationPresent(Annotation1.class)){
            System.out.println("Service11已添加@Annotation1注解");
            Annotation1 annotation = method.getAnnotation(Annotation1.class);
            System.out.println(annotation.value());
            System.out.println(annotation.version());
        }else {
            System.out.println("Service11未添加@Annotation1注解");
        }
    }
}
