import java.util.Scanner;

public class Lecture4Problem4 {
    public static void main(String[] args) {
        int digitsCount = countDigits(343434);

        int[] array = array(34987471);

    }

    public static int[] array(long number){  //takes a long integer number as input and returns an array of integers
        int digitsCount = countDigits(number); //It calculates the number of digits in the input number using the countDigits
        int[] array = new int[digitsCount]; //It initializes an array array with a length equal to the number of digits

        for(int i = array.length - 1; i >= 0; i--){ //It then uses a loop to extract each digit from the input number
            array[i] = (int)(number % 10);
            number /= 10;
        }

        return array;
    }
    public static int countDigits(long number) {
        int digitsCount = 0;

        while (number > 0) {
            number /= 10;
            digitsCount++;
        }

        return digitsCount;
    }
}

