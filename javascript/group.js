const input = ["eat", "tea", "tan", "ate", "nat", "bat"]

/* function groupAnagrams(input) {
        const map = new Map();
       for (let index = 0; index < input.length; index++) {
           const element = input[index];
           const anagram = element.split('').sort().reverse().join('')
           console.log(`map :${JSON.stringify(map)}`)
           if (!map.has(anagram)) {
               map.set(anagram, []);
           }
           map.get(anagram).push(element)
           console.log(map.get(anagram))
       }
       return Array.from(map.values()); 
} */

function groupAnagrams(input) {
    const map = new Map();
    for (let index = 0; index < input.length; index++) {
        const element = input[index];
        const anagram = element.split('').sort().join('');
        if (!map.has(anagram)) {
            map.set(anagram, [])
        }
        map.get(anagram).push(element)
    }
    return Array.from(map.values())
}

console.log(groupAnagrams(input))