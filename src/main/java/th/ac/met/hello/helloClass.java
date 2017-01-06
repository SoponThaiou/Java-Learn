package th.ac.met.hello;

/**
 * Created by Admin on 6/1/2560.
 */
public class helloClass {
    public static void main(String[] args) {
        System.out.println("Hello World");

        int[] nums = {10, 20, 30, 40, 50, 60};
        int sum = 0;

        for (int i = 0; i <= nums.length - 1; i++) {
            sum += nums[i];
        }
        System.out.println("Summary in array nums = " + sum);
    }
}
