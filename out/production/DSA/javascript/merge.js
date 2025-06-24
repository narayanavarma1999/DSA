
const input = [2, 6, 4, 1, 3, 7, 9, 8]

function mergeSort(input) {

     if (input.length <= 1) {
        return input;
    }
    let mid = Math.floor(input.length / 2);
    let left = mergeSort(input.slice(0, mid));
    let right = mergeSort(input.slice(mid,));
    // console.log(`input${input}`)
    return merge(input, left, right);

}


function merge(input, left, right) {

   
    let m = left.length;
    let n = right.length;

    let i = 0;
    let j = 0;
    let k = 0;


    while (i < m && j < n) {
        if (left[i] < right[j]) {
            input[k++] = left[i++]
        } else {
            input[k++] = right[j++]
        }
    }

    while (i < m) {
        input[k++] = left[i++]
    }

    while (i < n) {
        input[k++] = right[j++]
    }

    return [...input]

}

console.log(mergeSort(input, 0, input.length - 1))
