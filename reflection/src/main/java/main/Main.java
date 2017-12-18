package main;

import entity.Invoke;
import entity.LibraryBook;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

/**
 * Main
 * created on 18.12.2017
 *
 * @author Nikita Zabaykin vladlihovid@gmail.com
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        LibraryBook book = new LibraryBook("1984", "Robert", LocalDate.now(),
                100000, 321, "AG12324", "Bob");

        Class<LibraryBook> clazz = LibraryBook.class;
        for (Class<?> inter : clazz.getInterfaces()) {
            System.out.println(inter.getName());
        }

        for (Field field : clazz.getDeclaredFields()) {
            Class<?> type = field.getType();
            Annotation[] annotations = field.getDeclaredAnnotations();
            System.out.println(Arrays.toString(annotations) + " " + type.getName());
        }

        for (Method method : clazz.getMethods()) {
            if (method.isAnnotationPresent(Invoke.class)) {
                try {
                    final Class<?> returnType = method.getReturnType();
                    if (Objects.equals(returnType.getName(), "void")) {
                        method.invoke(book);
                    } else {
                        System.out.println(method.invoke(book));
                    }
                } catch (IllegalAccessException | InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
