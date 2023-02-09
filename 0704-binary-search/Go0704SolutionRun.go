// Package _704_binary_search Description:
//
// Author: milesyli
// Date: 2023/2/8 6:15 PM
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

	fmt.Println("target: ")
	var target int
	fmt.Scan(&target)
	pos := search(nums, target)
	fmt.Println(pos)
}

func stringArrToIntArr(strArr []string) []int {
	intArr := make([]int, len(strArr))
	for idx, intStr := range strArr {
		intArr[idx], _ = strconv.Atoi(intStr)
	}
	return intArr
}
