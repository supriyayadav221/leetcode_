// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.


/**
 * @param {number[]} nums
 * @return {boolean}
 */
var containsDuplicate = function(arr) {
    if(new Set(arr).size < arr.length)
    return true;
    return false;
    
};