package vttp.d7;

import java.util.function.Function;

public class FuncMain {
    public static void main(String[] args) {
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

        //FuncMain.toUpper();

        //int value = FuncMain.str2int("1234");
        System.out.printf("String to integer value: %d\n", value);
    }
}
