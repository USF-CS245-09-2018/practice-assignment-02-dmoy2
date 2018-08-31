public class BinaryRecursiveSearch implements Practice2Search {
    @Override
    public String searchName() {
        return ("Binary Search - Recursive");
    }

    @Override
    public int search(int[] arr, int target) {      // helper function
        int min = 0;
        int max = arr.length -1;

        return BinSearch(arr, target, min, max);

    }

    public int BinSearch(int[] arr, int target, int min, int max){
        if(min > max){
            return -1;
        }
        int mid = (min + max)/2;

        if(arr[mid] == target){
            return mid;
        }
        else if (arr[mid] > target){
            return BinSearch(arr, target, min, mid -1);
        }
        else{
            return BinSearch(arr, target, mid +1, max);
        }
    }
}
