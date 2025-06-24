function findDuplicates(nums) {
  const result = [];

  for (let i = 0; i < nums.length; i++) {
    let index = Math.abs(nums[i]) - 1;

    if (nums[index] < 0) {
      result.push(Math.abs(nums[i]));
    } else {
      nums[index] = -nums[index];
    }
  }
  console.log(`nums:${JSON.stringify(nums)}`);

  return result;
}

const nums =[4, 3, 2, 7, 8, 2, 3, 1]
//const nums = [0, 0, 1, 1, 1, 2, 2, 3, 3, 4];

console.log(findDuplicates(nums));

// /* 0,1,2,3,4 */

// /* function removeDuplicateElements(array) {
//   const uniqueArray = [];

//   while (array.length > 0) {
//     const element = array[index];
//     if (!uniqueArray.includes(element)) {
//         array[index] =element
//     }
//   }
//   return uniqueArray
// } */

// function removeDuplicateElements(arr) {
//   let index = 0;
//   for (let i = 1; i < arr.length; i++) {
//     if (arr[i] > arr[index]) {
//       index++;
//       arr[index] = arr[i];
//     }
//   }
//   console.log(`array :${JSON.stringify(arr)}`);
//   return index;
// }

// console.log(removeDuplicateElements(arr));
