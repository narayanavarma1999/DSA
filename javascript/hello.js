const obj = { a: 1, b: 2, c: 3 };
const result = Object.entries(obj).map(([key, value]) => ({ key, value }));
console.log(result);
// [{ key: 'a', value: 1 }, { key: 'b', value: 2 }, { key: 'c', value: 3 }]


/* function groupAnagrams(words) {
  const map = new Map();

  for (let word of words) {
    const key = word.split('').sort().join('');
    if (!map.has(key)) {
      map.set(key, []);
    }
    map.get(key).push(word);
  }
  console.log(`final data:${JSON.stringify([...(map.entries())])}`)
  console.log(`${map.values()}`)

  // Convert the map values to an array
  return Array.from(map.values());
}

// Test
const input = ["bat", "tab", "eat", "tea", "tan", "ate", "nat"];
const result = groupAnagrams(input);
console.log(result);
 */
/* 
function groupAnagrams(words) {
  const groups = {}; // plain object instead of Map

  for (let word of words) {
    const key = word.split('').sort().join('');
    if (!groups[key]) {
      groups[key] = [];
    }
    groups[key].push(word);
  }

  console.log(`groups:${JSON.stringify(groups)}`)
  // Convert object values to array
  return Object.values(groups);
}

// Test
const input = ["bat", "tab", "eat", "tea", "tan", "ate", "nat"];
const result = groupAnagrams(input);
console.log(result);
 */

/* var a = 10;
function foo() {
  console.log(a);
  var a = 20;
}
foo();

for (let i = 0; i < 3; i++) {
  setTimeout(() => console.log(i), 1000);
} */
/* 
const obj = {
  val: 42,
  getVal: function () {
    return this.val;
  },
};
console.log(`VALUE:${obj.getVal()}`);
const get = obj.getVal;
console.log(get);

const obj1 = {
  val: 42,
  getVal: function () {
    return this.val;
  },
};
const get1 = obj1.getVal();
console.log(`get value one:${get1}`);
console.log(get1);

console.log('start');
setTimeout(() => console.log('timeout'), 0);
Promise.resolve().then(() => console.log('promise'));
console.log('end');
 */
/* 
console.log("hi"+[] + []);
console.log([] + {});
console.log({} + []);
 */

/* console.log(true + true);      // ?
console.log('5' - 1);          // ?
console.log(null == undefined) // ?
console.log(NaN === NaN)       // ?

console.log(typeof null);         // ?
console.log(typeof NaN);          // ?
console.log(0.1 + 0.2 == 0.3);   // ?

let a = {};
let b = {};
console.log(a == b); // ?

console.log('5' == 5);  // ?
console.log('5' === 5); // ?


function outer() {
  let counter = 0;

  function inner() {
    counter++; // inner remembers 'counter' even after outer has executed
    console.log(counter);
  }

  return inner;
}

const increment = outer(); // outer() runs and returns inner()
increment(); // Output: 1
increment(); // Output: 2
increment(); // Output: 3
 */

/* const original = {
  name: "Varma",
  address: { city: "Hyderabad" }
};

const shallowCopy = { ...original };

shallowCopy.name = "Narayana";
shallowCopy.address.city = "Mumbai";

console.log(original.name); //  "Mumbai" */

/* const original = {
  name: "Varma",
  address: { city: "Hyderabad" }
};

const deepCopy = JSON.parse(JSON.stringify(original));

deepCopy.address.city = "Mumbai";
 */
//console.log(original.address.city); // ✅ "Hyderabad"
/* function groupAnagrams(words) {
  const anagramGroups = {};

  for (let word of words) {
    // Sort the word to create a key
    const sorted = word.split('').sort().join('');
    
    // If the key doesn't exist, initialize with an empty array
    if (!anagramGroups[sorted]) {
      anagramGroups[sorted] = [];
    }
    
    // Push the word into the correct group
    anagramGroups[sorted].push(word);
  }

  // Return all grouped anagrams
  return Object.values(anagramGroups);
}


console.log(groupAnagrams(["bat", "tab", "eat", "tea", "tan", "ate", "nat"]));
 */