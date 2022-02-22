const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

const numberSum = (a, b) => {
    return Number(a) + Number(b);
};

console.log('Sum of 2 Numbers');
rl.question('Enter 1st number: ', a => {
    rl.question('Enter 2nd number: ', b => {
        isNaN(Number(a) && Number(b)) ? console.log('Please enter valid numbers only') :
            console.log(`Sum: ${a} + ${b} = ${numberSum(a, b)}`);
        rl.close();
    });
});

/**
 * Output:
 * 
 * Sum of 2 Numbers
 * Enter 1st number: 2
 * Enter 2nd number: 5
 * Sum: 2 + 5 = 7
 */