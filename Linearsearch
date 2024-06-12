public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

      
        int[] nums = new int[n];

       
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();    }
         System.out.println("Enter the element to be searched");  
        int target = scanner.nextInt(); 
        int ans = linearsearch(nums,target);
        System.out.println(ans);
    }
    // search in the array, return the the index at which element is found
    static int linearsearch(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }

        /* a loop for traversing the array */
        for (int index = 0; index < arr.length; index++) {
            //check for element at every index
            int element = arr[index];
            if (element == target){
                return index;
            }
        }
// this executes if none of the other return statements have not executed
        return -1;

    }


}
