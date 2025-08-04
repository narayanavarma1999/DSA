
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


function groupAnagrams(strs) {
    const map = new Map()
    for (const word of strs) {
        const sortedWord = word.split('').sort().join('')
        console.log(sortedWord)
        if (!map.has(sortedWord)) {
            map.set(sortedWord, [])
        }
        map.get(sortedWord).push(word)
    }
    return Array.from(map.values())
}

console.log(groupAnagrams(["eat", "tea", "tan", "ate", "nat", "bat"]))

function productExceptSelf(array) {

    let left = 1;
    let right = 1
    let n = array.length
    let output = new Array(n).fill(1)

    for (let index = 0; index < array.length; index++) {
        const element = array[index];
        output[index] *= left;
        left *= element
    }

    for (let index = n - 1; index >= 0; index--) {
        const element = array[index];
        output[index] *= right;
        right *= element

    }
    return output
}


console.log(productExceptSelf([1, 2, 3, 4]))