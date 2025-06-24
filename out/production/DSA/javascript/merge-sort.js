/* function mergeArrays(nums1, nums2, m, n) {
  nums1 = [...nums1, ...nums2];
  return nums1;
}
*/

function mergeArrays(nums1, nums2, m, n) {
  let numOneCopy = nums1.slice(0, m);
  console.log(`numOneCopy:${JSON.stringify(numOneCopy)}`);

  let p1 = 0;
  let p2 = 0;

  for (let i = 0; i < m + n; i++) {
    if (p2 >= n || (p1 < m && numOneCopy[p1] < nums2[p2])) {
      nums1[i] = numOneCopy[p1];
      p1++;
    } else {
      nums1[i] = nums2[p2];
      p2++;
    }
  }

  console.log(`p1:${p1} , p2:${p2}`);

  return nums1;
}

let m = 3;
let n = 3;
const nums1 = [1, 2, 3, 0, 0, 0];
const nums2 = [2, 5, 6];

const result = mergeArrays(nums1, nums2, m, n);
console.log(`result:${JSON.stringify(result)}`);
