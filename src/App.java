
public class App {
    public static void main(String[] args) throws Exception {
        int[] data = {1, 23, 4, 5, 7,10};

        // BubbleSort Algorithm O(n^2)
        bubbleSort myBubbleSort = new bubbleSort(data);
        myBubbleSort.sort();
        myBubbleSort.output();
    }
}
