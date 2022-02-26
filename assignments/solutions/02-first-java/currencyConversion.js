/**
 * Currency Conversion (INR to USD)
 * 
 * @param {number} input
 * @returns {number}
 */

const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

const currencyConversion = (input) => {
    return input / 75;
}

console.log('Currency Conversion (INR to USD)');

rl.question('Enter Amount (in INR): ', input => {
    console.log(`₹${input} = $${currencyConversion(input).toFixed(3)}`)
    rl.close();
});

/**
 * Output:
 *
 * Currency Conversion (INR to USD)
 * Enter Amount (in INR): 200
 * ₹200 = $2.667
 */