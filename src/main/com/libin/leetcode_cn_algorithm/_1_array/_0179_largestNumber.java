package libin.leetcode_cn_algorithm._1_array;

import java.util.Arrays;

/**
 * Copyright (c) 2021/3/26. libin Inc. All Rights Reserved.
 * Authors: libin <libin>
 * <p>
 * Purpose :
 * 给定一组非负整数 nums，重新排列每个数的顺序（每个数不可拆分）使之组成一个最大的整数。
 * 注意：输出结果可能非常大，所以你需要返回一个字符串而不是整数。
 * 示例 1：
 * 输入：nums = [10,2]
 * 输出："210"
 * 示例 2：
 * 输入：nums = [3,30,34,5,9]
 * 输出："9534330"
 * 示例 3：
 * 输入：nums = [1]
 * 输出："1"
 * 示例 4：
 * 输入：nums = [10]
 * 输出："10"
 * 提示：
 * 1 <= nums.length <= 100
 * 0 <= nums[i] <= 109
 */
public class _0179_largestNumber {
	public String largestNumber(int[] nums) {
		String[] strs = new String[nums.length];
		for (int i = 0; i < nums.length; i++) {
			strs[i] = String.valueOf(nums[i]);
		}
		// 使用双轴快排
		Arrays.sort(strs, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));
		StringBuilder sb = new StringBuilder();
		for (String str : strs) {
			// 0,0 -> 0
			if (sb.toString().equals("0")) sb.delete(0, 1);
			sb.append(str);
		}
		return sb.toString();
	}
}
