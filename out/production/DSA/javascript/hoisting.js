
let value = 10;

function outer() {
    console.log("1:", value)

    var value = 20;

    function inner() {
        console.log("2:", value)
        let value = 30;
        console.log("3:", value)
    }

    try {
        inner()
    } catch (error) {
        console.log('4', error.message)
    }
    console.log('5:', value)
}

outer()
console.log(value)