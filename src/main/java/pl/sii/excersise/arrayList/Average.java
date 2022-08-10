package pl.sii.excersise.arrayList;

public class Average {
    public static void main(String[] s) {
        int[] tab = new int[]{1, 5, 2, 2, 10,4};

        int sum = 0;
        for (int i : tab)
            sum += i;

        System.out.println(sum + " " + sum / ((tab.length)));
    }
}
