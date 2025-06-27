/* function isValid(input) {
    const stack = [];
    const elements = input.split("");
    for (let index = 0; index < elements.length; index++) {
        const element = elements[index];
        if ((element === "(" || element === "[" || element === "{")) {
            stack.push(element)
        } else {
            let top = stack.pop()
            if (!top || ((element === "}" && top != "{") || (element === "]" && top != "[") || (element === ")" && top != "("))) {
                return false
            }
        }
    }
    return stack.length === 0;
} */

const map = {
    "[": "]",
    "(": ")",
    "{": "}",
}


function isValid(input) {
    const stack = []
    const elements = input.split("")
    for (let index = 0; index < elements.length; index++) {
        const element = elements[index];
        if (map[element]) {
            stack.push(element)
        } else {
            let top = stack.pop()
            if (!top || (element != map[top])) {
                return false
            }
        }
    }
    return stack.length === 0
}

console.log(isValid("()[]{}")); // true
console.log(isValid("([)]")); // false
console.log(isValid("{[]}")); 
