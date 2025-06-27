"use strict"
const person = {
    name: "Rajat",
    getName: function () {
        return this.name;
    }
}

const developer = {
    name: "Dev",
    getName: person.getName
}

const tester = {
    name: "QA"
}

function execute(fn) {
    console.log("1:", fn())
}

console.log(person.getName.call(developer))
console.log(person.getName())
//execute(person.getName)
//execute(developer.getName)
execute(person.getName.bind(tester))
execute(person.getName.bind(person))
//execute(person.getName.call(developer))
//execute(person.getName.apply(tester))


function reverseWords(sentence) {
    let left = 0;
    let right = sentence.length
    let words = sentence.split("")
    while (left<right) {
        let temp = words[left]
        words[left] = words[right]
        words[right] = temp
        left++;
        right--;
    }
    return words.join('');   
}


//For the purpose of user debugging.
console.log(reverseWords("Hello World"));
