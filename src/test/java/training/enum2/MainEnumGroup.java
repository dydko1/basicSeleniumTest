package training.enum2;


import static training.enum2.Example.*;

public class MainEnumGroup {
    public static void main(String[] args) {
        //System.out.println(ENUM_A1.isInGroup(Group.A));
        Example example11 = ENUM_A2;
       Group group11 = Group.B;

       example11.displayMessage();

    }
}
