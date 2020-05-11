import java.util.*;

//David Nygren
//April 15, 2020
//This class implements recursive methods that execute certain functions

public class Recursion{
    //This method takes the sum of squares of the given integer
    public static int sumSquares(int n){
        if (n == 0)
            return 0;
        else
            return sumSquares(n-1)+ n*n;
    }

    //This method returns string in reverse
    public static String reverse(String str){
        //calling on own method, reverse
        if (str.isEmpty())
            return str;
        return reverse(str.substring(1)) + str.charAt(0);
    }

    //This method calculates the sum of all elements in an array
    public static double sumArray(double[] array){
        if(array.length == 0)return 0;
        if (array.length == 1) {
            return array[array.length - 1];
        }
        return array[0] + sumArray(Arrays.copyOfRange(array, 1, array.length));
    }

    //This method returns x^n
    public static double power(double x, int n){
        if (n == 0) return 1;
        double half = power(x, n/2);
        if (n < 0) {
            return 1 / power(x, -n);
        }
        else if (n%2 == 1) {
            return x * half * half;
        } else {
            return half * half;
        }
    }

    //This method converts a binary number to its decimal form
    public static int binaryToDecimal(String str){
        if (str.length() == 0) return 0;
        String first = str.substring(0,1);
        String second = str.substring(1);
        return Integer.parseInt(first) * (int)Math.pow(2, str.length()-1) + binaryToDecimal(second);    
    }

    //This method implements binary search in an array
    public static int binarySearch(int[] array, int target, int first, int last){
        int middle = (first + last)/2;
        if(last < first){
            return -1;
        } 
        if (target < array[middle]){
            return binarySearch(array, target, first, middle - 1);
        }
        if (target > array[middle]){
            return binarySearch(array, target, middle + 1, last);
        }
        if (target == array[middle]){
            return middle;
        }
        return -1;
    }

    public static String moveDisk(int n, char start, char dest, char temp){
        if (n == 1) 
        { 
            return (start + "->" + dest); 
        } 
        moveDisk(n-1, start, temp, dest); 
        System.out.print(start + "->" + dest + ", "); 
        return moveDisk(n-1, temp, dest, start);
    }
}
