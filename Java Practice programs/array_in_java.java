import java.lang.reflect.Array;
import java.util.Arrays;

public class array_in_java {
    public static void main(String[] args) {
        // declaring array
        // int[] numbers = new int[10];
        // OR
        int numbers[] = new int[10];
        // old way to initialze array
        numbers[0] = 1;
        numbers[1] = 2;
        System.out.println(numbers); // --> this print gonna produce errors, because when we print an array java
        // generate a string calculated based on the address of the object which contain
        // the address of the array.

        // So, if we want to print an array using "System.out.println(numbers);" in one
        // line than
        // we need to import a "java.util.Arrays" package in java to use Array class
        // from it.
        // Using "Arrays" class --> to print array in one line
        System.out.println(Arrays.toString(numbers)); // ---> output [1, 2, 0, 0, 0, 0, 0, 0, 0, 0]

        // New way to initialize an array --->
        int[] arr = { 1, 2, 4, 3 };
        int len = arr.length; // --> a way to get length of a array in java and length is not a funtion,its
                              // like a variable in a class

        System.out.println(len);

        // In java, arrays have a fixed size, so once we create them than we cannot add
        // and remove items from them. To make array whose size are not fixed we need to
        // use collection classes.
        Arrays.sort(arr); // --> function to sort array in Arrays class
        System.out.println(Arrays.toString(arr));

        // <--- Multi-dimensional array -->
        int arr1[][] = new int[2][3]; // --> that is how we declare 2d array
        // OR
        // int[][] arr1=new int[2][3]; ---> same as above
        // same way one can create 3d, 4d etc. arrays
        // (eg.int arr[][][]=new int[1][2][3])
        arr1[0][0] = 1;
        arr1[0][1] = 2;

        System.out.println(Arrays.deepToString(arr1));
        // we use deeptostring() function to print multidimensional array in java.

        int[][] arr2 = { { 1, 2, 3 }, { 5, 6, 7 } }; // ----> another way to declare 2d array
        System.out.println(Arrays.deepToString(arr2));

    }
}
