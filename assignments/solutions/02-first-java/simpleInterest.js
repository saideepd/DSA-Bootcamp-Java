/**
 * Simple Interest
 * 
 * @param {number} principal
 * @param {number} time
 * @param {number} rate
 * @returns {number}
 */

const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

const simpleInterest = (p, t, r) => {
    return (p * t * r) / 100;
}

console.log('Simple Interest');
rl.question('Enter Principal Amount: ', principal => {
    rl.question('Enter Time (in years): ', time => {
        rl.question('Enter Rate of Interest (in percentage): ', rate => {
            console.log(`Simple Interest: ${simpleInterest(principal, time, rate)}`);
            rl.close();
        });
    });
});

/**
 * Output:
 *
 * Simple Interest
 * Enter Principal Amount: 100
 * Enter Time (in years): 2
 * Enter Rate of Interest (in percentage): 3
 * Simple Interest: 6
 */