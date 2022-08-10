package pl.sii.excersise.regex;

public class Regex003 {
 
   public static void main(String[] args) {
	   
	    System.out.println(validate("javaA_exercises"));
		System.out.println(validate("Java_exercises"));
		System.out.println(validate("java_Exercises"));		
		System.out.println(validate("Java_Exercises"));	
        }

   public static String validate(String text) {
	   if (text.matches("^[a-zA-Z]+_[a-z]+$"))
                return "Found a match!";
       else
                return "Not matched!";

   }
}