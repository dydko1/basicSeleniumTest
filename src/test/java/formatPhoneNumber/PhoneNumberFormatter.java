package formatPhoneNumber;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;

public class PhoneNumberFormatter {
    public static void main(String[] args) {

        System.out.println(formatNumber());
    }

    private static String formatNumber()  {

        String number = "123423452345Z";
       return String.format("(%s) %s-%s", number.substring(0, 3), number.substring(3, 6),
                number.substring(6));

    }
}
