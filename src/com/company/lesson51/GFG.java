package com.company.lesson51;// Java program to demonstrate how to

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

public class GFG {

	// Main method
	public static void main(String[] args)
	{
		try {
			Class classobj = GFG.class;
			Method[] methods = classobj.getMethods();
			for (Method m : methods) {

				if (m.getName().equals("getValues") || m.getName().equals("setValue")) {

					Annotation[][] Arrayannotations = m.getParameterAnnotations();

					System.out.println("Method Name: " + m.getName());
					printAnnotation(Arrayannotations);
				}
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}


	public void setValue()
	{
		System.out.println("setValue");
	}

	public String getValues(@AnnotationDemo(field1 = "GFG")
				String value)
	{
		System.out.println("setManyValues");
		return value;
	}

	public static void  printAnnotation(Annotation[][] Arrayannotations)
	{
		System.out.println("Annotation length: " + Arrayannotations.length);
		for (Annotation[] annotationRow : Arrayannotations) {
			for (Annotation annotation : annotationRow) {

				if(annotation instanceof  AnnotationDemo) {
					System.out.println("true   4321");


				AnnotationDemo anndemo = (AnnotationDemo)annotation;
				System.out.println("field1 of annotation: "
								+ anndemo.field1());
			}
		}
	}
}

@Retention(RetentionPolicy.RUNTIME)
@interface AnnotationDemo {

	// This annotation has many attributes.
	public String field1();
}}
