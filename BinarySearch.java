import java.util.Scanner;
public class BinarySearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();


        int[] arr = new int[n];


        System.out.println("Enter the elements of the array in ascending order : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();    }
        System.out.println("Enter the element to be searched");
        int target = scanner.nextInt();
        int ans = binarysearch( arr, target);
        System.out.println(ans);

    }

    //return a index
    static int binarysearch(int[] arr, int target){
        int start= 0;
        int end= arr.length - 1;

        while(start <= end){
            int mid= start + (end - start)/2;

            if (target < arr[mid]){
                end = mid -1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }

}
