const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

const sumOfAllNumbers = (input) => {
    return input.reduce((total, num) => {
        return Number(total) + Number(num);
    });
};

let inputArray = [],
    takeInput = true;

console.log('Sum of All Numbers\nEnter x to stop entering numbers.');

// The below function is an IIFE (Immediately Invoked Function Expression)
(function loop() {
    rl.question('Enter number: ', input => {
        // Stop input if user enters x or invalid number
        if (input === 'x' || isNaN(Number(input))) {
            takeInput = false;
            console.log(`Sum of all numbers: ${sumOfAllNumbers(inputArray)}`);
            return rl.close();
        };
        inputArray.push(input);
        takeInput = true;
        takeInput ? loop() : rl.close();
    });

})();

/**
 * Output:
 * 
 * Sum of All Numbers
 * Enter x to stop entering numbers.
 * Enter number: 3
 * Enter number: 4
 * Enter number: 5
 * Enter number: 6
 * Enter number: x
 * Sum of all numbers: 18
 */