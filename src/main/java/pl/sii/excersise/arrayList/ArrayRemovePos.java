package pl.sii.excersise.arrayList;

public class ArrayRemovePos {
    public static void main(String[] s) {
        int[] arr = new int[]{540,99,90};

        int[] arr2 = new int[arr.length - 1];
        int pos = 1;
        //pos--;

        for (int i = 0; i < arr.length - 1; i++) {

            if (i >= pos)
                arr2[i] = arr[i + 1];
            else
                arr2[i] = arr[i];
        }

        for (int i : arr2) {
            System.out.println(i);

        }
    }
}
