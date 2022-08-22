package pl.sii.excersise.sorting;

public class SortingArrayExample3_4 {

    public static void main(String[] args) {
        int[] tab = new int[]{-300, 78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65, -1000};
        System.out.println("before");
        for (int i : tab) {
            System.out.println(i);
        }
        System.out.println("--------------");
        sortTab(tab);
        for (int i : tab) {
            System.out.println(i);
        }
        System.out.println("--------------");
    }

    private static void sortTab(int[] tab1) {
        int n = tab1.length;

        for (int i = 0; i < n; i++) {
            int j = i;
            int tmp = tab1[i];
            while (j > 0 && tab1[j - 1] > tmp) {
                tab1[j] = tab1[j - 1];
                j--;
            }
            tab1[j] = tmp;
        }
    }
}
