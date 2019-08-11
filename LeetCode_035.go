package tong

func main()  {

}

func searchInsert(nums []int, target int) int {
	for k, v := range nums {
		if v >= target {
			return k
		}
	}

	// 遍历完没有找到,插入到最后
	return len(nums)
}