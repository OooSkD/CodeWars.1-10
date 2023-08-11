package task5;


/*
DESCRIPTION:
    Convert number to reversed array of digits
    Given a random non-negative number, you have to return the digits of this number within an array in reverse order.
*/
public class Kata {
    public static int[] digitizeMy1(long n) {
        if (n<=0) return new int[]{0};
        int lenght = String.valueOf(n).length();
        int[] numArr = new int[lenght];
        for (int i = 0; i < lenght; i++) {
            numArr[i] = (int) (n % 10);
            n = n/10;
        }
        return numArr;
    }
}
