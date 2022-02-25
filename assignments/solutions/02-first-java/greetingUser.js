/**
 * Greeting User
 * 
 * @param {String} input
 * @returns {String}
 */

const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

console.log('Greeting User');
rl.question('Enter your name: ', input => {
    console.log(`Hello ${input}!`);
    rl.close();
});

/**
 * Output:
 * 
 * Greeting User
 * Enter your name: Saideep
 * Hello Saideep!
 */