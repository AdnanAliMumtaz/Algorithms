public class selectionSort {
    int[] data;

    public selectionSort(int[] data) { 
        this.data = data;
    }

    public void swap(int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    public void sort() {
        int length = data.length;

        for (int i=0; i<length; i++) {
            int min = i;

            for (int j=i+1; j<length; j++) {
                if (data[j] < data[min])
                {
                    min = j;
                }
            }

            if (min != i) {
                swap(min, i);
            }
        }
    }

    public void output() {
        for (int i=0; i<data.length; i++) {
            System.err.print(data[i] + " ");
        }
    }
    
}
