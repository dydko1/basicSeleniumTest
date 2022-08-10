package trash.div;

import java.util.Random;

public class TextSpliter {

    public static String[] cityCode() {
        String[] citiesNameAndCode = {"Ruda Slaska:41-701", "Katowice:41-702", "Chorzow:41-703"};
        Random rnd = new Random();
        int generateCity = rnd.nextInt(citiesNameAndCode.length);
        String[] cityAndCode = citiesNameAndCode[generateCity].split(":");

        return cityAndCode;
    }

}
