package rocks.zipcode.io.quiz3.fundamentals;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {


    public static String[] vowels = {"a", "e", "i", "o", "u"};

    public static Boolean hasVowels(String word) {
        char[] wordArr = word.toCharArray();
        for (Character c : wordArr) {
            if (isVowel(c) == true) {
                return true;
            }
        }
        return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        int indexCount = 0;
        char[] wordArr = word.toCharArray();
        for (Character c : wordArr) {
            if (!hasVowels(word)) {
                return -1;

            } else if (isVowel(c)) {
                break;
            }

            indexCount++;

        }
        return indexCount;
    }

    public static Boolean startsWithVowel(String word) {
        char[] wordArr = word.toCharArray();
        if (isVowel(wordArr[0])){
            return true;
        }
        return false;
    }

    public static Boolean isVowel(Character character) {
        for (int i = 0; i < 5; i++) {
            if (character.toString().equalsIgnoreCase(vowels[i]) == true) {
                return true;
            }
        }
        return false;
    }
}
