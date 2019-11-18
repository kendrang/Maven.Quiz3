package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {
        String [] ourWave = new String[str.length()];
        char[] chars = str.toCharArray();
        for (int i = 0 ; i < chars.length ; i ++){
            str =  str.toLowerCase();
//            String upper = (Character.toString(str.charAt(i)).toUpperCase());
                String upper = Character.toString(chars[i]).toUpperCase();
          str = str.replace(chars[i], upper.toCharArray()[0]);

            ourWave[i] = str;

        }
        System.out.println(ourWave);
        return ourWave;
    }
}
