package task4;

/*
DESCRIPTION:
    In this simple assignment you are given a number and have to make it negative. But maybe the number is already negative?
    Notes: The number can be negative already, in which case no change is required.
    Zero (0) is not checked for any specific sign. Negative zeros make no mathematical sense.
 */
public class Kata {
    public static int makeNegative(final int a){
        return (a<=0) ? a:-a;
    }

}
