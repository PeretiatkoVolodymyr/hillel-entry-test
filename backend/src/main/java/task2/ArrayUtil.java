package task2;

import java.util.List;

public class ArrayUtil {

    public static <T> void fromArrayToCollection(T[] array, List<T> list) {
        for (T obj : array) {
            list.add(obj);
        }
    }
}
