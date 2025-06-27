let oranges = [[2, 1, 1], [1, 1, 0], [0, 1, 2]];

const minutes = 0
const rottenOranges = []

function findMinutes(oranges) {

    let m = oranges.length
    let n = oranges[0].length


    for (let i = 0; i < oranges.length; i++) {
        for (let j = 0; j < oranges.length; j++) {
            if (oranges[i][j] === 2) {
                rottenOranges.push([i, j])
            }
        }
    }

    //console.log(rottenOranges)

    while (rottenOranges.length) {

        let [x, y] = rottenOranges.shift()

        console.log(x, y)

        console.log(oranges[0])
        console.log(oranges[1])
        console.log(oranges[2])

        console.log("--------------------")

        /* 
        *  Top portion
        */
        if (x > 0 && oranges[x - 1][y] === 1) {
            oranges[x - 1][y] = 2
            rottenOranges.push([x - 1, y])
        }

        /* 
        *  Buttom portion
        */
        if (x < m - 1 && oranges[x + 1][y] === 1) {
            oranges[x + 1][y] = 2
            rottenOranges.push([x + 1, y])
        }

        /* 
        *  Left portion
        */

        if (y > 0 && oranges[x][y - 1] === 1) {
            oranges[x][y - 1] = 2
            rottenOranges.push([x, y - 1])
        }

        /* 
        *  Right portion
        */
        if (y < n - 1 && oranges[x][y + 1] === 1) {
            oranges[x][y + 1] = 2
            rottenOranges.push([x, y + 1])
        }

        console.log(`rottenOranges:${JSON.stringify(rottenOranges)}`)

        // maxMin = Math.max(maxMin, level`)
    }

    for (let i = 0; i < oranges.length; i++) {
        for (let j = 0; j < oranges.length; j++) {
            if (oranges[i][j] === 1) {
                oranges[i][j] = -1
            }
        }
    }

    ///return maxMin
    return oranges
}


console.log(findMinutes(oranges))