package pl.sii.excersise.sorting;

public class SortingArrayExample3_3 {

    public static void main(String[] args) {
        int[] tab = new int[]{-300, 78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65, -1000};
        System.out.println("before");
        for (int i : tab) {
            System.out.println(i);
        }

        sortTab(tab);
        System.out.println("-------------");
        for (int i : tab) {
            System.out.println(i);
        }
    }


    private static void sortTab(int[] tab) {
        int n = tab.length;

        for (int i = 0; i < n; i++) {
            int tmp = tab[i];
            int j = i;
            while ((j > 0) && (tab[j - 1] > tmp)) {
                tab[j] = tab[j - 1];
                j--;
            }
            if (j != i)
                tab[j] = tmp;
        }
    }
}
