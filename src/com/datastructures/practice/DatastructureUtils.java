package com.datastructures.practice;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class DatastructureUtils {

	public static <T extends Object> void printTheDatastructure(T struct, String prop, String next, String splitter)
			throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException,
			InvocationTargetException {
		while (struct != null) {
			Method elementGetter = struct.getClass().getMethod("get" + prop);
			Object element = elementGetter.invoke(struct);
			System.out.print(element+splitter);
			Method nextGetter = struct.getClass().getMethod("get" + next);
			struct = (T) nextGetter.invoke(struct);
		}
		System.out.println();
	}
}
