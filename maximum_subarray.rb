def max_sub_array(nums)
    dynamicApp = []
    dynamicApp[0] = nums[0]

    for i in 1...nums.length
        sum = dynamicApp[i-1] + nums[i]
		dynamicApp[i] = [sum, nums[i]].max
    end

    return dynamicApp.max
end
