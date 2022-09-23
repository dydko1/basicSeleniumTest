package pl.sii.trash.reg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainReg {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("w3School1", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Visit W3Schools!");

        boolean matchFound = matcher.find();

        if (matchFound)
            System.out.println("Match found");
        else
            System.out.println("Match does not found!! ");
    }
}
