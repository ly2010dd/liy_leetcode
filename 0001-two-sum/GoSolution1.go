// Package _001_two_sum Description:
//
// Author: milesyli
// Date: 2023/2/2 1:11 AM
package main

func twoSum(nums []int, target int) []int {
	for i, _ := range nums {
		for j := i + 1; j < len(nums); j++ {
			if target == nums[i]+nums[j] {
				return []int{i, j}
			}
		}
	}
	return []int{}
}
