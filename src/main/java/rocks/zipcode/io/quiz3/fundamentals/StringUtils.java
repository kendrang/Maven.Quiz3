package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        String result = "";
        char[] wordArr = str.toCharArray();
     for (int i = 0 ; i < wordArr.length ; i++){
         if (i == indexToCapitalize){
            String capMe = String.valueOf(wordArr[i]);
            result += capMe.toUpperCase();
         }
         else result += wordArr[i];
     }
        return result;
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        char[] wordArr = baseString.toCharArray();
        for (int i = 0 ; i < wordArr.length ; i ++){
            if (wordArr[indexOfString] == characterToCheckFor){
                return true;
            }
        }
        return false;
    }

    public static String[] getAllSubStrings(String string) {
        Set<String> subStrings = new HashSet<>();
        for (int i = 0 ; i < string.length() ; i ++){
            for (int j = i+1 ; j <= string.length(); j++){
               subStrings.add(string.substring(i,j));
            }
        }
        return subStrings.toArray(new String[0]);
    }

    public static Integer getNumberOfSubStrings(String input){

        return getAllSubStrings(input).length;
    }
}
