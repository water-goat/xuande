package AnnotationTest;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface Annotation1 {
    String value();
    int version() default 1;
}
