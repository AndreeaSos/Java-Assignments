package isp.lab2.Exercise1RandomArray;

import java.util.Arrays;
import java.util.Random;

public class Exercise1RandomArray {

    public static int[] getArrayOfRandomNumbers(int n) {
        int[] array = new int[n];
        //TODO: implement the logic to fill the array with random numbers
        Random r=new Random();
        for (int i = 0; i <n ; i++) {
            array[i]=r.nextInt(90);
        }

        return array;
    }

    public static int[] findMinAndMax(int[] array) {
        Arrays.sort(array);
        int a[]=new int[2];
        a[0]=array[0];
        a[1]=array[array.length-1];
        return a;
    }

    public static void print() {
        System.out.println("TEST");
    }

    public static void main(String[] args) {

        Random random = new Random();
        //genereaza numar random intre 10 si 100
        int size = random.nextInt(91) + 10;
        int[] a = getArrayOfRandomNumbers(size);
        int[] mm = findMinAndMax(a);
        System.out.println("Min is:"+mm[0]+" Max is:"+mm[1] );
    }
}
