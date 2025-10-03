package vttp.d7;

import java.util.function.Function;

public class FuncMain {
    public static void main(String[] args) {
        //String -> Uppercase
        Function<String, String> toUpper = (str) -> {
            return str.toUpperCase();
        };

        Runnable runMe = () -> {
            System.out.println("An expression to be processed");
        };

        //String -> Int 
        Function<String, Integer> str2int = (str) -> {
            return Integer.parseInt(str);
        };
        runMe.run();
        String uppercase = toUpper.apply("abc");
        System.out.printf("String to uppercase value: %s\n", uppercase);
        int value = str2int.apply("1234");
        System.out.printf("String to integer value: %d\n", value);
    }
}
