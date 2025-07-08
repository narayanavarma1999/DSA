function isAnagram(nums, target) {
    const nArr = nums.split('').sort().reverse().join('')
    const tArr = target.split('').sort().reverse().join('')
    console.log(nArr,tArr)
    return nArr===tArr

}

const nums = "listen"
const target = "silent"

console.log(isAnagram(nums, target))