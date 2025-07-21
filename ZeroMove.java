public class ZeroMove {
    public static void moveZeroes(int[] nums){

        int count = 0; // Count of non-zero elements

        for(int i=0; i<nums.length; i++) {
            if(nums[i] != 0) {
                nums[count++] = nums[i]; // Move non-zero element to the front
            }
        }
        while(count < nums.length) {
            nums[count++] = 0; // Fill the rest of the array with zeros
        }

    }

public static void main(String[] args) {
    int[] arr = {1, 0, 2, 0, 3, 0, 4};
    moveZeroes(arr);
    for (int num : arr) {
        System.out.print(num + " ");
    }
}
}