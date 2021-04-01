package libin.leetcode_cn_algorithm._1_array;

/**
 * Copyright (c) 2021/4/1. libin Inc. All Rights Reserved.
 * Authors: libin <libin>
 * Purpose : 283. 移动零
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * 示例:
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * 说明:
 * 必须在原数组上操作，不能拷贝额外的数组。
 * 尽量减少操作次数。
 */
public class _0283_moveZeroes {
    public void moveZeroes(int[] nums) {
        int left = 0, right = 0;
        while (left < nums.length && right < nums.length) {
            while (left < nums.length && nums[right] == 0) {
                // 左起第一个不为0的下标
                right++;
            }
            while (left < right && nums[left] != 0) {
                left++;
            }
            int tmp = nums[right];
            nums[right] = nums[left];
            nums[left] = tmp;
        }
    }
}
