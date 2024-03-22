package isp.lab2.Exercise5EvenOddSearch;

//import java.util.ArrayList;
//import java.util.List;

public class Exercise5EvenOddSearch {

    public static int[] findEvenOdd(String input) {
        String[] numbersString = input.split(",");
        int largestEven = Integer.MIN_VALUE;
        int smallestOdd = Integer.MAX_VALUE;
        int largestEvenIndex = -1;
        int smallestOddIndex = -1;

        for (int i = 0; i < numbersString.length; i++) {
            int num = Integer.parseInt(numbersString[i]);
            if (num % 2 == 0 && num >= largestEven) {
                largestEven = num;
                largestEvenIndex = i;
            } else if (num % 2 != 0 && num <= smallestOdd) {
                smallestOdd = num;
                smallestOddIndex = i;
            }
        }

        if (largestEvenIndex == -1 && smallestOddIndex == -1) {
            System.out.println("No even or odd numbers found in the list.");
        } else {
            System.out.println("Largest even number: " + largestEven + " at position " + (largestEvenIndex + 1));
            System.out.println("Smallest odd number: " + smallestOdd + " at position " + (smallestOddIndex + 1));
        }

        return new int[]{largestEven,largestEvenIndex, smallestOdd,smallestOddIndex};
    }

    public static void main(String[] args) {
        String input = "1,2,3,4,5,6,7,8,9,10";
        int[] result = findEvenOdd(input);
        for (int i : result) {
            System.out.println(i);
        }
    }
}
