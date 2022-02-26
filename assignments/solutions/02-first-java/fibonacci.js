/**
 * Fibonacci Series
 * 
 * @param {number} input
 * @returns {number}
 */

const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

const fibonacci = (input) => {
    let a = 0, b = 1, temp = 0;
    console.log(a);
    console.log(b);
    for (let i = 0; i < input - 2; i++) {
        temp = b;
        b = a + b;
        a = temp;
        console.log(b);
    }
}

console.log('Fibonacci Series');
rl.question('Enter number to print Fibonacci series: ', input => {
    fibonacci(input);
    rl.close();
});

/**
 * Output:
 * 
 * Fibonacci Series
 * Enter number to print Fibonacci series: 10
 * 0
 * 1
 * 1
 * 2
 * 3
 * 5
 * 8
 * 13
 * 21
 * 34
 */