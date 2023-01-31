package com.company.lesson51;


import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Repeatable(MyAnnotations.class)
//@Retention(RetentionPolicy.RUNTIME)
//@Target({ElementType.METHOD,ElementType.FIELD})
public @interface MyAnnotation {

}



 @interface Risks {
    Risk[] value();
}


