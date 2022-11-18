package lombok;

public class Test1 {
    static TestData testData; //=new TestData();
    public static void main(String[] args) {

        testData.name="Miro";
        testData.lastname="Dydko";

        System.out.println(testData.toString());
    }
}
