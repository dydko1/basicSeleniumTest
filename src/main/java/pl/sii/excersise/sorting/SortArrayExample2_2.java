package pl.sii.excersise.sorting;

public class SortArrayExample2_2 {
    public static void main(String[] args) {
        //int[] tab = new int[]{78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65};
        int[] tab = new int[]{11,-5,-5, -4, -6,0, 10};
        System.out.println("before:");
        for (int i : tab) {
            System.out.println(i);
        }
        System.out.println("after:");

        soringTab(tab);
        for (int i : tab) {
            System.out.println(i);
        }
    }

    private static void soringTab(int[] tab) {
        int n = tab.length;
        int tmp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                tmp = tab[i];
                if (tab[i] > tab[j]) {
                    tab[i] = tab[j];
                    tab[j] = tmp;
                }
            }

        }
    }
}
