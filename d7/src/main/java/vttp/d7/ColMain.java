package vttp.d7;

import java.security.SecureRandom;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ColMain {
    public static void main(String[] args) {
        Random rand = new SecureRandom();
        List<Integer> myList = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            myList.add(rand.nextInt(100));
        }
        // for (int i=0; i<20; i++) {
        //     myList.add(i);
        // }
        System.out.println(myList);

        int result = 0;
        for (int i = 0; i < myList.size(); i++) {
            int v = myList.get(i); 
            if (0 != (v % 2)) { //Retrieve only those not divisible by 2
                continue; //Skips remaining block and continue next iteration
            }
            result = result + myList.get(i);
        }

        System.out.println("Result:" + result);

        List<Integer> intList = myList.stream()
            .filter(v -> 0 == (v%2)) //Filter those divisible by 2
            .map(v -> v+1)
            .toList();
        System.out.println(intList);

        int sumOfMyList = myList.stream()
            .filter(v -> 0 == (v%2)) //Filter those divisible by 2
            .map(v -> v+1)
            .reduce(0, (acc,v) -> {
                return acc + v;
            });

        System.out.printf("sumOfMyList: %d\n", sumOfMyList);
    }
    
}
