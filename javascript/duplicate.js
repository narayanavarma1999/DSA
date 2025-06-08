const arr = [0, 0, 1, 1, 1, 2, 2, 3, 3, 4];

/* 0,1,2,3,4 */

/* function removeDuplicateElements(array) {
  const uniqueArray = [];

  while (array.length > 0) {
    const element = array[index];
    if (!uniqueArray.includes(element)) {
        array[index] =element
    }
  }
  return uniqueArray
} */

function removeDuplicateElements(arr) {
  let index = 0;
  for (let i = 1; i < arr.length; i++) {
    if (arr[i] > arr[index]) {
      index++;
      arr[index] = arr[i];
    }
  }
  console.log(`array :${JSON.stringify(arr)}`);
  return index;
}

console.log(removeDuplicateElements(arr));
