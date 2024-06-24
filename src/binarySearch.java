public class binarySearch {
    int[] data;
    int target;

    public binarySearch() {
        this.data = data;
        this.target = target;
    }

    public int searchIteratively(int low, int high, int[] data, int target) {
        
        while (low <= high) 
        { 
            int mid = (low + high) / 2;
            if (data[mid] < target) {
                low = mid + 1;
            }
            else if (data[mid] > target) {
                high = mid - 1;
            }
            else if (data[mid] == target) {
                return mid;
            }
        }

        return -1;
    }

    public int searchRecursively(int low, int high, int[] data, int target) 
    {
        if (low > high) {
            return -1;
        }

        int mid = (high + low) / 2;
        
        if (data[mid] > target) {
            mid = searchRecursively(low, mid - 1, data, target);
        }
        else if (data[mid] < target) {
            mid = searchRecursively(mid + 1, high, data, target);
        }

        return mid;
    }


}
