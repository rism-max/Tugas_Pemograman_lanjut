package Array;

public class Sorting {
    public static int[] getHasilAscending(String text, int amount) {
        int num, i, j, tmpr;
        num = amount;
        int arr[] = new int[num];
        String[] xtmp = text.split(",");
        int b = 0;
        for (String s : xtmp) {
            arr[b] = Integer.parseInt(s.trim());
            b++;
        }
        for (i = 0; i < (num - 1); i++) {
            for (j = 0; j < num - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    tmpr = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmpr;

                }
            }

        }
        return arr;
    }

    public static int[] getHasilDescending(String text, int amount) {
        int num, i, j, tmpr;
        num = amount;
        int arr[] = new int[num];
        String[] tmp = text.split(",");
        int b = 0;
        for (String s : tmp) {
            arr[b] = Integer.parseInt(s.trim());
            b++;
        }
        for (i = 0; i < (num - 1); i++) {
            for (j = 0; j < num - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    tmpr = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmpr;

                }
            }

        }
        return arr;
    }
}