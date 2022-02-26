/**
 * Armstriong number
 * 
 * @param {number} input
 * @returns {boolean}
 */

const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

const armstrong = (input) => {
    let power = input.length;
    let result = 0, original = input;

    for(let i = 0; i < power; i++) {
        let temp = input % 10;
        input = parseInt(input / 10);
        result += Math.pow(temp, power);
    }

    return result === Number(original);
}

console.log('Armstrong Number');
rl.question('Enter number: ', input => {
    console.log(`${input} is ${armstrong(input) ? "an Armstrong" : "not an Armstrong"} Number`);
    rl.close();
});

/**
 * Output:
 *
 * Armstrong Number
 * Enter number: 153
 * 153 is an Armstrong Number
 * 
 * Armstrong Number
 * Enter number: 23232
 * 23232 is not an Armstrong Number
 */