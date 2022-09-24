//Kadane's Algorithm

//Intuition is that max subarray will always be between positive elements,
//so we only start considering sum when element is greater than 0
//else we keep sum as 0
//Also keep track of maximum number till now
//If sum is greater than max till now update max
//Finally return max;

//Time Complexity: O(N)
//Space Complexity: O(1)

package find;

public class MaxSubarraySum {

    public static void main(String[] args) {
        int[] arr = {-1, -3, 4, 5, -2, -7, 2, -9, 4};
        int maxSum = maxSubarraySum(arr);
        System.out.println(maxSum);
    }

    private static int maxSubarraySum(int[] arr) {
        int sum = 0, maxi = Integer.MIN_VALUE;
        int s = 0;
        int start_index = 0;
        int last_index = 0;
        for(int i = 0; i < arr.length; i++) {

            sum += arr[i];

            if(sum > maxi) {
                maxi = sum;
                start_index = s;
                last_index = i;
            }

            if(sum < 0) {
                sum = 0;
                s = i+1;
            }
        }
        System.out.printf("Subarray from {%s, %s}%n", start_index, last_index);
        return maxi;
    }
}
