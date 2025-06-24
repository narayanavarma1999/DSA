const jewels = "aA";
const stones = "aAAbbbb";

function findJewels(jewels, stones) {
    let jewelsCount = 0;
    /* for (let i = 0; i < stones.length; i++) {
        for (let j = 0; j < jewels.length; j++) {
            if (jewels[j] === stones[i]) {
                jewelsCount++
            }
        }
    } */
    const seen = new Set();
    
    for (let index = 0; index < jewels.length; index++) {
        const element = jewels[index];
        if (!seen.has(element)) {
            seen.add(element)
        }
    }

    for (let index = 0; index < stones.length; index++) {
        const element = stones[index];
        if (seen.has(element)) {
            jewelsCount++;
        }
    }


    return jewelsCount
}


console.log(findJewels(jewels, stones))