function maxRainWater(height) {
    let maxRight = []
    let maxLeft = []
    let i = 0

    let leftElement = height[i];

    for (let j = 0; j < height.length; j++) {
        leftElement = Math.max(leftElement, height[j])
        maxLeft.push(leftElement)
    }

    let n = height.length - 1
    let rightElement = height[n]
    for (let j = n; j >= 0; j--) {
        rightElement = Math.max(height[j], rightElement)
        maxRight.unshift(rightElement)
    }

    let totalWater = 0
    let currentUnit = 0
    for (let index = 0; index < height.length; index++) {
        currentUnit = Math.min(maxLeft[index], maxRight[index]) - height[index]
        totalWater += currentUnit
    }
    return totalWater
}

const height = [0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1]
console.log(maxRainWater(height))