const arr = [0, 1, 2, 2, 3, 0, 4, 2];

function removeTargetElement(arr, target) {
  let i = 0;
  for (let index = 0; index < arr.length; index++) {
    const element = arr[index];
    if (element !== target) {
      arr[i++] = element;
    }
  }
  console.log(`array :${JSON.stringify(arr)}`);
  return i;
}

console.log(removeTargetElement(arr, 2));


