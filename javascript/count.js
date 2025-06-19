function countAnagrams(text, pattern) {
    const result = [];
    const pLen = pattern.length;
    const tLen = text.length;

    if (pLen > tLen) return 0;

    const pCount = new Array(26).fill(0);
    const sCount = new Array(26).fill(0);

    const aCharCode = 'a'.charCodeAt(0);

    // fill initial counts
    for (let i = 0; i < pLen; i++) {
        pCount[pattern.charCodeAt(i) - aCharCode]++;
        sCount[text.charCodeAt(i) - aCharCode]++;
    }

    let count = 0;
    if (arraysEqual(pCount, sCount)) count++;

    for (let i = pLen; i < tLen; i++) {
        console.log(`1-->${JSON.stringify(text.charCodeAt(i) - aCharCode)}`)
        console.log(`2-->${text.charCodeAt(i - pLen) - aCharCode}`)
        sCount[text.charCodeAt(i) - aCharCode]++;
        sCount[text.charCodeAt(i - pLen) - aCharCode]--;
        if (arraysEqual(pCount, sCount)) count++;
    }

    return count;
}

function arraysEqual(a, b) {
    for (let i = 0; i < 26; i++) {
        if (a[i] !== b[i]) return false;
    }
    return true;
}

// Example usage
console.log(countAnagrams("cbaebabacd", "abc")); // Output: 2

