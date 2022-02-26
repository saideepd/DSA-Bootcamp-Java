/**
 * Palindrome String
 * 
 * @param {String} input
 * @returns {boolean}
 */

const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

const palindrome = (input) => {
    return input.toLowerCase() === input.split('').reverse().join('').toLowerCase();
}

console.log('Palindrome String');
rl.question('Enter text: ', input => {
    console.log(`${input} is ${palindrome(input) ? "palindrome" : "not palindrome"}`);
    rl.close();
});
 
/**
 * Output:
 * 
 * Palindrome String
 * Enter text: mAdaM
 * mAdaM is palindrome
 * 
 * Palindrome String
 * Enter text: Hello
 * Hello is not palindrome
 */