'use strict';
var x = 5;
if(x>2)
{
x=22;
}
const greeting = (word) => { 
};

const speaker = (message, callback) => {    

};

const addValues = (arr, value) => { 

};

const addNumbers = (num, arr, times, callback) => {

};
const createList = (availableItems) => {


};


describe('Testing challenge 1', () => {
  test('It should return the message with all uppercase characters', () => {
    expect(speaker('hello 301 students!', greeting)).toStrictEqual('HELLO 301 STUDENTS!');
  });
});

describe('Testing challenge 2', () => {
  test('It should add the number 8 to the array five times', () => {
    expect(addNumbers(8, [], 5, addValues)).toStrictEqual([8, 8, 8, 8, 8]);
    expect(addNumbers(8, [], 5, addValues).length).toStrictEqual(5);
  });
});