public class BinaryIterativeSearch implements Practice2Search {
    @Override
    public String searchName() {
        return ("Binary Search - Iterative");
    }

    @Override
    public int search(int[] arr, int target) {
        int min = 0;
        int max = arr.length;

        while (min < max) {
            int mid = (min + max)/ 2;

            if (arr[mid] == target) {
                return mid;
            }
            else if (target > arr[mid]){
                min = mid + 1;
            }
            else{
                max = mid -1;
            }
        }
        return -1;
    }
}
