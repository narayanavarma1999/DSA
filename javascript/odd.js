/* function findLargestOdd(num) {
    let n = num.length - 1;
    while (n > 0) {
        if ((Number(num[n]) % 2) == 1) {
            return num.substring(0, n + 1)
        }
        n--
    }
    return ""
}

const num = "52"

console.log(findLargestOdd(num)) */

const strs = ["dog", "racecar", "car"]

function find(strs) {
    if (!strs.length) return ""
    for (let i = 0; i < strs[0].length; i++) {
        let ch = strs[0][i];
        for (let j = 1; j < strs.length; j++) {
            if (strs[j][i] !== ch) {
                return strs[0].substring(0, i)
            }
        }
    }
    return strs[0]
}

console.log(find(strs))





/* 
if (!strs.length) return "";

    for (let i = 0; i < strs[0].length; i++) {
        let char = strs[0][i];
        for (let j = 1; j < strs.length; j++) {
            if (i >= strs[j].length || strs[j][i] !== char) {
                return strs[0].substring(0, i);
            }
        }
    }
    return strs[0];
*/