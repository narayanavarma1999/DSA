const arr = [2, 3, 4, 10, 40];
const target = 10;

function binary(nums, start, end, target) {
    while (start < end) {


        let mid = Math.floor((start + end) / 2)

        if (nums[mid] === target) {
            return mid
        }

        if (nums[mid] > target) {
            return binary(arr, start, mid - 1, target)
        } else {
            return binary(nums, mid + 1, end, target)
        }
    }
    return end;
}

console.log(binary(arr, 0, arr.length, target))