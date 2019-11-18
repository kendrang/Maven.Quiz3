package rocks.zipcode.io.quiz3.fundamentals;

import java.util.Arrays;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator extends VowelUtils {

    public String translate(String str) {
        String[] pigWords = str.split(" ");
        String result = "";
        for (int i = 0 ; i < pigWords.length ; i ++){
            char[] charA = pigWords[i].toString().toCharArray();

            if (!hasVowels(pigWords[i])){
                result += pigWords[i]+"ay";
                return result;
            }
            if (startsWithVowel(pigWords[i])){
                result += pigWords[i]+"way ";
            }
            if(!startsWithVowel(pigWords[i])){
                String newWord = "";
               newWord += pigWords[i].substring(getIndexOfFirstVowel(pigWords[i]), pigWords[i].length());
               newWord += pigWords[i].substring(0,getIndexOfFirstVowel(pigWords[i])) + "ay ";
               result += newWord;
            }

        }
        return result.trim();
    }
}
