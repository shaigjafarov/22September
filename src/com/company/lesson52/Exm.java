package com.company.lesson52;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

public class Exm {


    public static void main(String[] args) {
        Student st = new Student();
        Class<? extends Student> aClass = st.getClass();

        for (Field field : aClass.getDeclaredFields()) {
            System.out.println(field.getType().getName());
            if (!field.getType().getName().equalsIgnoreCase("string")) {
                throw new TypeStringDeyil();
            }

        }

    }

}

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.CLASS)
@interface TestAnnotation {

}

class TypeStringDeyil extends RuntimeException {


}

