package unit8_arrays;

public class intro_to_arrays {
    public static void main(String[] args) {
        /*int [] b = {75, 29, 350, 7, 4192};
        for (int i = 4; i >= 0; i--) {
            System.out.println(b[i]);
        }*/

        // simple processing using arrays

        int count = 0;

        int sumOfNums = 0;

        int [] nums = {75, 29, 350, 7, 4192, 204, 88, 67};

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >100) {
                count += 1;
                System.out.println(nums[i]);
            }

            // add up all numbers
            sumOfNums += nums[i];
        }

        System.out.println();
        System.out.println("Number of values greater than 100: " + count);
        double mean = (sumOfNums)/(nums.length);
        System.out.println("Average of nums: " + mean);

    }

}
