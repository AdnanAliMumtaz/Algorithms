public class insertionSort {
    int[] data;

    public insertionSort(int[] data) {
        this.data = data;
    }

    public void swap(int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    public void sort() {
        // int length = data.length;
        // int j;

        // for (int i = 0; i < length; i++) {
        //     j=1;

        //     while (j > 0 && ) {

        //     }
        // }
    }

    public void output() {
        for (int i=0; i<data.length; i++) {
            System.err.print(data[i] + " ");
        }
    }
}
