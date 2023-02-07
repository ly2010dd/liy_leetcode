// Package _001_two_sum Description:
//
// Author: milesyli
// Date: 2023/2/2 1:20 AM
package main

import (
	"fmt"
	"strconv"
	"strings"
)

func main() {
	fmt.Println("arr: ")
	var arrStr string
	fmt.Scan(&arrStr)
	arr := strings.Split(arrStr, ",")
	nums := stringArrToIntArr(arr)

	for {
		fmt.Println("target: ")
		var target int
		fmt.Scan(&target)
		//ret := twoSum(nums, target)
		ret := twoSum2(nums, target)
		fmt.Println(ret)
	}
}

func stringArrToIntArr(strArr []string) []int {
	intArr := make([]int, 5)
	for idx, intStr := range strArr {
		intArr[idx], _ = strconv.Atoi(intStr)
	}
	return intArr
}
