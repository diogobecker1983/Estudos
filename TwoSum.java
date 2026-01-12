package org.example;

public class TwoSum {

    /**
     * https://leetcode.com/problems/two-sum/
     */
    static void main() {
        int[] nums = {3, 2, 4};
        int target = 6;
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSum(nums, target);
        System.out.println("Resultado=" + result[0] + " e " + result[1]);
    }

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length ; j++) {
                System.out.println("Vamos testar o indice " + i + " junto com o indice " + j);
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{};
    }
}
