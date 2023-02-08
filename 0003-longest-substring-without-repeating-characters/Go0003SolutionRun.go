// Package _003_longest_substring_without_repeating_characters Description:
//
// Author: milesyli
// Date: 2023/2/8 11:05 AM
package _003_longest_substring_without_repeating_characters

func max(x, y int) int {
	if x < y {
		return y
	}
	return x
}
