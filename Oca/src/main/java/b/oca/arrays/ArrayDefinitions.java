package b.oca.arrays;

import java.util.Arrays;
import java.util.Random;

/**
* Created by Bálint on 2016. 10. 01..
        */
public class ArrayDefinitions {

    public static void main(String... args){
        int r = new Random().nextInt();
        int x = 2;
        int[] a = {1, x, r, Integer.parseInt(args[0])};
        System.out.println(Arrays.toString(a));

        //ok
        printArray(new Integer[]{4,3,6});
        //nok, this form can be used only for array initialization
        //printArray({4,3,6});

    }


    private static void printArray(Object[] array){
        System.out.println(Arrays.toString(array));
    }

}
