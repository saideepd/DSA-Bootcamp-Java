/**
 * HCM & LCM of 2 Numbers
 * 
 * @param {number, number} num1, num2
 * @retruns {number, number} HCF, LCM
 */
const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

let num1 = 0,
    num2 = 0,
    temp = 0,
    temp1 = 0,
    temp2 = 0,
    hcf = 0,
    lcm = 0;

console.log('HCF & LCM of 2 numbers');
rl.question('Enter 1st number: ', num1 => {
    rl.question('Enter 2nd number: ', num2 => {
        temp1 = num1;
        temp2 = num2;
        while (temp2 != 0) {
            temp = temp2;
            temp2 = temp1 % temp2;
            temp1 = temp;
        }
        hcf = temp1;
        lcm = (num1 * num2) / hcf;
        console.log(`HCF: ${hcf}\nLCM: ${lcm}`);
        rl.close();
    });
});

/**
 * Output:
 * 
 * HCF & LCM of 2 numbers
 * Enter 1st number: 4
 * Enter 2nd number: 16
 * HCF: 4
 * LCM: 16
 */

/*
Working: 

n1 = 4
n2 = 16

16!=0
	t = 16
	t2 = 4 % 16 = 4
	t1 = 16
4!=0
	t = 4
	t2 = 16 % 4 = 0
	t1 = 4
0 == 0
hcf = t1 = 4
lcm = (n1 * n2) / hcf = (4 * 16) / 4 = 64 / 4 = 16  
*/