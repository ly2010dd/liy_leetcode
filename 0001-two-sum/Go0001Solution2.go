// Package main Description:
//
// Author: milesyli
// Date: 2023/2/2 2:12 AM
package main

func twoSum2(nums []int, target int) []int {
	m := make(map[int]int)
	m[nums[0]] = 0
	for i := 1; i < len(nums); i++ {
		another := target - nums[i]
		if _, ok := m[another]; ok {
			return []int{m[another], i}
		}
		m[nums[i]] = i
	}
	return nil
}
