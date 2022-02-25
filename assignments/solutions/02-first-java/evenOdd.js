/**
 * Print input number is Even or Odd
 * 
 * @param {number} input
 * @returns {number}
 */

const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

const evenOdd = (input) => {
    return input % 2 === 0 ? 'Even' : 'Odd';
}

console.log('Even Odd Number');
rl.question('Enter number: ', input => {
    console.log(`The number ${input} is ${evenOdd(input)}`);
    rl.close();
});

/**
 * Output:
 * 
 * Even Odd Number
 * Enter number: 3
 * The number 3 is Odd
 * 
 * Even Odd Number
 * Enter number: 3
 * The number 3 is Odd
 */