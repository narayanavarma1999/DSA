function reverseString(str, k) {
    const input = str.split('')
    for (let x = 0; x < input.length; x = x + (2 * k)) {
        let mid = Math.floor(k / 2)
        for (let j = 0; j < mid; j++) {
            let temp = input[x + j];
            input[x + j] = input[x + k - j - 1]
            input[x + k - j - 1] = temp
        }
    }
    return input.join('')
}
const str = "abcdefghij"
const k = 2
console.log(reverseString(str, k))