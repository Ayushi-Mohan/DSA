//Moore's voting algorithm

//Time Complexity: O(N)
//Space complexity: O(1)

//Intuition is that if a number is more that n/2 times in the array, we can keep count such that only 1 element remains
//after matching count of all elements to equality
package find;

public class MajorityElement {

    public static void main(String args[]) {
        int[] arr = {5, 7, 1, 5, 5, 1, 7, 7, 7, 5, 7, 7};
        int majority = findMajorityElement(arr);
        System.out.println(majority);
    }

    private static int findMajorityElement(int[] arr) {

        int count = 0, element = 0;

        for(int i : arr) {

            if(count == 0) element = i;

            if(i == element) count++;
            else count--;
        }
        return element;
    }
}
