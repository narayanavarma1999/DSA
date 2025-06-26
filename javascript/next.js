const input = [1, 5, 0, 3, 4, 9, 2, 6, 28];

function findNextGreatest(input) {
    let n = input.length;
    const result = Array(n).fill(-1)
    console.log(result)
    const stack = []
    for (let index = n - 1; index >= 0; index--) {

        while ((stack.length !== 0) && input[index] > input[stack[stack.length - 1]]) {
            stack.pop()
        }

        if ((stack.length !== 0)) {
            result[index] = input[stack[stack.length - 1]]
        }
        stack.push(index)
    }
    console.log(result)
    return result
}

console.log(findNextGreatest(input))