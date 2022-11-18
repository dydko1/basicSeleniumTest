package lombok;

public class Test1 {

    public static void main(String[] args) {

        TestData testData = new TestData(); // jako static
        testData.name = "Miro";
        testData.lastname = "Dydko";


        System.out.println(testData.toString());
        System.out.println("sss=" + testData.lists.get(1));
    }
}
