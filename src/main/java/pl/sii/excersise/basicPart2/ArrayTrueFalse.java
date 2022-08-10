package pl.sii.excersise.basicPart2;

public class ArrayTrueFalse {

    public static void main(String[] args) {
        int[][] tab = new int[][]{{10, 20, 30}, {40, 50, 60}};

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[0].length; j++) {
                System.out.print(" " + tab[i][j]);
            }
            System.out.println();
        }

        System.out.println("---------------");
        tab = (trans(tab));
        printTab(tab);

    }

    private static int[][] trans(int[][] tab) {
        int[][] tmp = new int[tab[0].length][tab.length];

        for (int i = 0; i < tab.length; i++)
            for (int j = 0; j < tab[0].length; j++) {
                tmp[j][i] = tab[i][j];
            }
        return tmp;
    }

    private static void printTab(int tab[][]) {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[0].length; j++) {
                System.out.print(String.format(" %s", tab[i][j]));
            }
            System.out.println();
        }
    }
}
