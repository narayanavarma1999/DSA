function largestNumber(nums) {
  // Convert all numbers to strings
  let numsStr = nums.map(String);
  
  console.log(`number string:${JSON.stringify(numsStr)}`)
  // Sort based on custom comparator
  numsStr.sort((a, b) =>{ 
    console.log(`${b+a} and ${a+b}====>${(b + a) - (a + b)}`)
    return (b + a) - (a + b)});

  // Edge case: if the largest number is "0", return "0"
  if (numsStr[0] === '0') return '0';

  console.log(`number :${numsStr}`)
  // Join and return
  return numsStr.join('');
}

// Example:
const arr = [3, 30, 34, 5, 9];
console.log(largestNumber(arr)); // Output: "9534330"
