package tong

func moveZeroes(nums []int) {
    lastSwitchZeroindex := 0
    
    for i, v := range nums {
        if v != 0 {
            nums[i], nums[lastSwitchZeroindex] = nums[lastSwitchZeroindex], nums[i]
            lastSwitchZeroindex++
        }
    }
}