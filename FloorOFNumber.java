public class FloorOFNumber {
        public static void main(String[] args) {
            int[] arr = {2, 3, 5, 9, 14, 16, 18};

            int target = 15;
            int ans = FloorNumber(arr, target);
            System.out.println(ans);


        }

        static int FloorNumber(int[] arr, int target) {
            int start = 0;
            int end = arr.length - 1;

            // find whether the array is sorted in ascending or descending
            boolean isAsc = arr[start] < arr[end];

            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
            return end;
        }
    }


