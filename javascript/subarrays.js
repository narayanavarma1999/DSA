
function subarrayGenerator(array) {
    const result = []
    for (let start = 0; start < array.length; start++) {
        const window = []
        for (let end = start; end < array.length; end++) {
            window.push(array[end])
            const snap = []
            for (let k = 0; k < window.length; k++) {
                snap.push(array[k])
            }
            result.push(snap)
        }
    }
    return result
}



console.log(subarrayGenerator([4, 5, 6]))