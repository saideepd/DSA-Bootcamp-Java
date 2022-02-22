const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

const isLeapYear = (year) => {
    return year % 4 === 0;
};

rl.question('Enter a year to check whether it is Leap Year or not: ', year => {
    isNaN(Number(year)) ? console.log('Please enter a valid Year') :
        console.log(`${year} is ${isLeapYear(year) ? '' : 'not '}a Leap Year`);
    rl.close();
});

/**
 * Output:
 * 
 * Q: Enter a year to check whether it is Leap Year or not: 2022
 * A: 2022 is not a Leap Year
 * 
 * Q: Enter a year to check whether it is Leap Year or not: 2020
 * A: 2020 is a Leap Year
 */