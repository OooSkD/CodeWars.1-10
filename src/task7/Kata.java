package task7;

/*
DESCRIPTION:
Complete the solution so that it returns true if the first argument(string) passed in ends with the 2nd argument (also a string).
*/
public class Kata {
    public static boolean solution(String str, String ending) {
        if (str.length()<ending.length()) return false;
        return str.substring(str.length()-ending.length()).equals(ending);
    }
}
