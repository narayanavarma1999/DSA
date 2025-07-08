/* function findDisappearedNumbers(nums) {
    const result =[]
    const seen = new Set(nums);
    for (let index = 1; index < nums.length; index++) {
        if (!seen.has(index)) {
            result.push(index)
        }
    }

    return result
}
 */

var findDisappearedNumbers = function (nums) {
    for (let i = 0; i < nums.length; i++) {
        const index = Math.abs(nums[i]) - 1;
        if (nums[index] > 0) {
            nums[index] = -nums[index]; // mark as visited
        }
    }

    [0, 1, 2, 3, 4, 5, 6, 7]
    [4, 3, 2, 7, 8, 2, 3, 1]
    [-4, -3, -2, -7, 8, 2, -3, -1]

    console.log(`nums:${nums}`)

    const result = [];
    for (let i = 0; i < nums.length; i++) {
        if (nums[i] > 0) {
            result.push(i + 1);                                                              // i + 1 is missing
        }
    }

    return result;
};


/* var findDisappearedNumbers = function(nums) {
    const count = new Array(nums.length + 1).fill(0);
    const result = [];

    for (let num of nums) {
        count[num]++;
    }

    console.log(`count:${count}`)

    for (let i = 1; i < count.length; i++) {
        if (count[i] === 0) {
            result.push(i);
        }
    }

    return result;
};
 */

const nums = [4, 3, 2, 7, 8, 2, 3, 1]

const output = findDisappearedNumbers(nums)
console.log(output)