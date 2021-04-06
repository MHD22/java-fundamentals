'use strict';
var x =100
const greeting = (word) => {
}
var g = 100
let z = x+g
const speaker = (message, callback) => {

}

const addValues = (arr, value) => { 

};

const addNumbers = (num, arr, times, callback) => {

};
const createList = (availableItems) => {


};


g='helloooo'


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