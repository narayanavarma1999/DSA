
var twoSum = function (nums, target) {
    const map = new Map()
    for (let i = 0; i < nums.length; i++) {
        let complement = target - nums[i]
        if (!map.has(complement)) {
            map.set(nums[i], i)
        } else {
            return [map.get(complement), i]
        }
    }
    return [-1, -1]
};

const nums = [2, 7, 11, 15]
const target = 9
console.log(nums+target)
console.log(twoSum(nums, target))
