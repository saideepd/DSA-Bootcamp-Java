/**
 * Largest Number
 * 
 * @param {number} num1
 * @param {number} num2
 * @returns {number}
 */

const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

const largest = (num1, num2) => {
    return num1 > num2 ? num1 : num2;
}

console.log('Largest Number Program');

rl.question('Enter 1st number: ', num1 => {
    rl.question('Enter 2nd number: ', num2 => {
        if(num1 === num2)
            console.log('Equal Numbers');
        else
            console.log(`Largest Number: ${largest(num1, num2)}`);
        rl.close();
    });
});

/**
 * Output:
 *
 * Largest Number Program
 * Enter 1st number: 3
 * Enter 2nd number: 4
 * Largest Number: 4
 * 
 * Largest Number Program
 * Enter 1st number: 3
 * Enter 2nd number: 3
 * Equal Numbers
 */