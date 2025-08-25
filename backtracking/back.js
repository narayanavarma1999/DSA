function backtrackImplementation(array) {
    let result = []

    function backtrack(path, start) {
        result.push([...path])
        for (let index = start; index < array.length; index++) {
            path.push(array[index]);
            backtrack(path, index + 1)
            path.pop();
        }
    }

    backtrack([], 0)

    return result

}

console.log(backtrackImplementation([1, 2, 3]))