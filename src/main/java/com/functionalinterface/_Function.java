package com.functionalinterface;

import com.entities.Person;
import com.infra.Gender;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class _Function {
    public static void main(String[] args) {
        int increment = incrementByOne(0);
        System.out.println(increment);

        increment = incrementByOneFunction.apply(increment);
        System.out.println(increment);

        System.out.println(incrementByOneFunction.compose(multiplyBy10Function).apply(2));

        System.out.println(incrementByOneFunction.andThen(multiplyBy10Function).apply(increment));

        System.out.println(calculateArea.apply(5,6));
        System.out.println(calculateArea.andThen(multiplyBy10Function).apply(5, 6));

        Person pan = new Person("Panagiotis", Gender.MALE);
        welcomeMessage.accept(pan);

        if (isMale.test(pan.getGender().toString())) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    static int incrementByOne(int number){
        return number + 1;
    }

    static Function<Integer,Integer> incrementByOneFunction = number -> number + 1;

    static Function<Integer,Integer> multiplyBy10Function = number -> number * 10;

    static BiFunction<Integer,Integer,Integer> calculateArea =
            (width, length) -> width * length;

    static Consumer<Person> welcomeMessage =
            p -> System.out.println(p.toString());

    static Predicate<String> isMale = g -> g.equals(Gender.MALE.toString());
}


