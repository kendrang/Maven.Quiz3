package rocks.zipcode.io.quiz3.generics;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import static java.util.stream.Collectors.toList;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {
        SomeType result = null;
        for (int i = 0; i < array.length; i++) {
            if (getNumberOfOccurrences(array[i]) % 2 != 0) {
                result = array[i];
            }
        } return result;
    }

    public SomeType findEvenOccurringValue() {
        SomeType result = null;
        for (int i = 0; i < array.length; i++) {
            if (getNumberOfOccurrences(array[i]) % 2 == 0) {
                result = array[i];
            }
        } return result;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        return Math.toIntExact(Arrays.stream(array)
                .filter(element -> element.equals(valueToEvaluate))
                .count());

    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
       return Arrays.stream(array)
                .filter(predicate :: apply).collect(toList()).toArray(Arrays.copyOf(array,0));

    }
}
