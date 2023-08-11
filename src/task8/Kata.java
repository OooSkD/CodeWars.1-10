package task8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
DESCRIPTION:
    In this kata you will create a function that takes a list of non-negative integers and strings and returns a new list with the strings filtered out.
*/
public class Kata {
    public static List<Object> filterList(final List<Object> list) {
        List<Object> result = new ArrayList<>();
        for (Object object : list) {
            if (object instanceof Integer)
                result.add(object);
        }
        return result;
    }
    public static List<Object> filterList2(final List<Object> list) {

        return list.stream().filter(o -> o instanceof Integer).collect(Collectors.toList());
    }
}
