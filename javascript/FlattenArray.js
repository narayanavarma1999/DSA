function flatten(arr, out = []) {
    for (const el of arr) {
        Array.isArray(el) ? flatten(el, out) : out.push(el);
    }
    return out;
}

//console.log(flatten([1, [2, [3, 4], 5], 6])); // → [1,2,3,4,5,6]


const nested = [1, [2, [3, 4], 5], 6];
//console.log(...nested)
const flat1 = nested.flat();        // depth = 1 (default) → [1, 2, [3, 4], 5, 6]
const flat = nested.flat(Infinity) // full flatten          → [1, 2, 3, 4, 5, 6]


function flattenIteration(nums) {
    const stack = [...nums]
    const out = []

    while (stack.length) {
        const value = stack.pop()
        if (Array.isArray(value)) {
            stack.push(...value)
        } else {
            out.push(value)
        }
    }
    return out.reverse()
}

function flattenIter(arr) {
  const stack = [...arr];      // copy so we don’t mutate input
  const out   = [];

  while (stack.length) {
    const value = stack.pop(); // depth-first
    if (Array.isArray(value)) {
      stack.push(...value);    // expand in place
    } else {
      out.push(value);
    }
  }
  return out.reverse();        // because we used pop / push
}

console.log(flattenIteration(nested))