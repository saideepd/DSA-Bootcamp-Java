/**
 * Calculator with user input
 * 
 * @param {String} operator
 * @param {number} num1
 * @param {number} num2
 * @returns {number}
 */

const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

const calculator = (operator, num1, num2) => {
    let result = 0;
    switch (operator) {
        case '+': result = parseFloat(num1) + parseFloat(num2);
            break;
        case '-': result = parseFloat(num1) - parseFloat(num2);
            break;
        case '*': result = parseFloat(num1) * parseFloat(num2);
            break;
        case '/': if (num2 === 0) result = "Divide by zero error";
            result = parseFloat(num1) / parseFloat(num2);
            break;
        case '%': result = parseFloat(num1) % parseFloat(num2);
            break;
        default: result = -1;
            break;
    }
    return result;
}

console.log('Calculator Program');
console.log("Enter any of the operators: '+', '-', '*','/','%'\nEnter x to close the program");

rl.question('Enter Operator: ', operator => {
    if (operator.toLowerCase() === 'x')
        rl.close();
    if (operator === '+' || operator === '-' || operator === '*' || operator === '/' || operator === '%') {
        rl.question('Enter 1st number: ', num1 => {
            rl.question('Enter 2nd number: ', num2 => {
                console.log(`Result: ${calculator(operator, num1, num2)}`);
                rl.close();
            });
        });
    } else {
        console.log("Invalid Operator");
        rl.close();
    }
});

/**
 * Output:
 *
 * Calculator Program
 * Enter any of the operators: '+', '-', '*','/','%'
 * Enter x to close the program
 * Enter Operator: +
 * Enter 1st number: 3
 * Enter 2nd number: 7
 * Result: 10
 */