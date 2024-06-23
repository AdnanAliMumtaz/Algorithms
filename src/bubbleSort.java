public class bubbleSort {
    int[] data;
    // int[] sorted;
    
    public bubbleSort(int[] data) {
        this.data = data;
        // this.sorted = null;
    }

    public void swap(int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    public void sort() {
        int length = data.length;
        for (int i=0; i<length; i++) {
            for (int j=0; j<length-1; j++) {
                if (data[j] > data[j+1]) {
                    swap(j, j+1);
                }
            }
        }
    }

    public void output() {
        for (int i=0; i<data.length; i++) {
            System.err.print(data[i] + " ");
        }
    }

}
