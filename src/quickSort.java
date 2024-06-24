
public class quickSort {
    int[] data;

    public quickSort(int[] data) {
        this.data = data;
    }

    // Partition method to partition the array
    public int partition(int[] data, int low, int high) {
        // Choose the middle element as pivot
        int pivotIndex = (low + high) / 2;
        int pivotValue = data[pivotIndex];
        
        // Move pivot to the end
        swap(pivotIndex, high);
        
        int storeIndex = low;
        
        // Rearrange elements around the pivot
        for (int i = low; i < high; i++) {
            if (data[i] < pivotValue) {
                swap( i, storeIndex);
                storeIndex++;
            }
        }
        
        // Move pivot to its final place
        swap( storeIndex, high);
        
        return storeIndex;
    }

    public void sort(int[] data, int low, int high) {

        if (low < high) {
            int pivot = partition(data, low, high);

            sort(data, low, pivot - 1);

            sort(data, pivot + 1, high);
        }

    }

    public void swap(int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    public void output() {
        for (int i = 0; i < data.length; i++) {
            System.err.print(data[i] + " ");
        }
    }
}
