const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

console.log('Multiplcation Table');
rl.question('Enter a number to print its multiplication table: ', num => {
    if (isNaN(Number(num))) {
        rl.close();
        return console.log('Please enter a valid number');
    }
    let i = 1;
    while (i <= 10) {
        console.log(`${num} x ${i} = ${num * i}`);
        i++;
    }
    rl.close();
})

/**
 * Output:
 * 
 * Multiplcation Table
 * Enter a number to print its multiplication table: 4
 * 4 x 1 = 4
 * 4 x 2 = 8
 * 4 x 3 = 12
 * 4 x 4 = 16
 * 4 x 5 = 20
 * 4 x 6 = 24
 * 4 x 7 = 28
 * 4 x 8 = 32
 * 4 x 9 = 36
 * 4 x 10 = 40
 */