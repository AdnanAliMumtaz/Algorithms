
public class App {
    public static void main(String[] args) throws Exception {
        
        // BubbleSort Algorithm O(n^2)
        int[] dataB = {1, 23, 4, 5, 7,10};
        bubbleSort myBubbleSort = new bubbleSort(dataB);
        myBubbleSort.sort();
        System.err.print("BubbleSort: ");
        myBubbleSort.output();
        System.err.println("");

        // SelectionSort Algorithm O(n^2)
        int[] dataS = {1, 2,4,12,5,3,89};
        selectionSort mySelectionSort = new selectionSort(dataS);
        mySelectionSort.sort();
        System.err.print("BubbleSort: ");
        mySelectionSort.output();
        System.err.println("");

        // // InsertionSort Algorithm - Need to do
        // int[] dataI = {};

        // Binary Search 
        int[] dataBS = {1,2,5,6,9,10,12};
        int target = 12; 
        binarySearch myBinarySearch = new binarySearch();
        int index = myBinarySearch.searchRecursively(0, dataBS.length-1, dataBS, target);
        System.out.println("Recursively Searched Index: " + index);

        int index_ = myBinarySearch.searchIteratively(0, dataBS.length-1, dataBS, target);
        System.out.println("Iteratively Searched Index: " + index_);
        



    }
}
