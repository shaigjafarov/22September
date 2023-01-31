package com.company.lesson51;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestClass {


    @MyAnnotation
    public String ab = "no";

    public static void main(String[] args) throws IllegalAccessException {

        TestClass testClass = new TestClass();

        Class<?> normal = TestClass.class;

        for (Field m : normal.getFields()) {

            if (m.getAnnotation(MyAnnotation.class) != null) {

                Object o = m.get(testClass);
                if (o == null) {
                    throw new NullPointerException();
                }
            }


        }


        int i = 0;
        for (Method method : normal.getMethods()) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            Annotation[][] parameterAnnotations = method.getParameterAnnotations();


            for (Annotation[] a : parameterAnnotations) {

                for (Annotation a1 : a) {

                    if (a1 instanceof TestAnnotation) {

                        TestAnnotation testAnnotation = (TestAnnotation) a1;

                        System.out.println(testAnnotation.name());
                        System.out.println(testAnnotation.value());
                        System.out.println(parameterTypes[i++].getName());



                    }
                }

            }


//            Arrays.stream(parameterAnnotations).forEach(a->a.ge);


        }


    }


//    public void printCon(@TestAnnotation()@TestAnnotation(name = "a11", value = "b11") String ss) {
//        System.out.println(ss);
//
//
//    }

}
