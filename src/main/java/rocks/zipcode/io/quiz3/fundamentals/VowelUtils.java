package rocks.zipcode.io.quiz3.fundamentals;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {


    public static  String[] vowels = {"a", "e", "i", "o", "u"};
    public static Boolean hasVowels(String word) {

        for (Character c : word.toCharArray()){
//            if (c.equals(v))
        }

        return null;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        return null;
    }


    public static Boolean startsWithVowel(String word) {
        return null;
    }

    public static Boolean isVowel(Character character) {
        for (int i = 0 ; i < 5 ; i++){
            if (character.toString().equalsIgnoreCase(vowels[i]) == true){
                return true;
            }
        }
        return false;
    }
}
