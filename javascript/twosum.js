
var twoSum = function (numbers, target) {
    let left = 0;
    let right = numbers.length - 1;
    while (left < right) {
        let sum = numbers[left] + numbers[right]
        if (sum === target) {
            return [left + 1, right + 1]
        } else if (sum > target) {
            right--
        } else {
            left++
        }
    }
};

const nums = [2, 7, 11, 15]
const target = 9

console.log(twoSum(nums, target))
