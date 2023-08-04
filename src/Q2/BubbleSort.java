package Q2;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arrayList = {59, 13, 1, 42, 100};
        bubbleSort(arrayList);
        for (int index : arrayList) {
            System.out.print(index + " ");
        }
    }

    public static void bubbleSort (int[] arrayList) {
        int temp;

        for(int i = 0; i < arrayList.length; i++) {
            for(int j = 1; j < (arrayList.length - 1); j++) {
                if(arrayList[j - 1] > arrayList[j]) {
                    temp = arrayList[j - 1];
                    arrayList[j - 1] = arrayList[j];
                    arrayList[j] = temp;
                }
            }
        }
    }
}
