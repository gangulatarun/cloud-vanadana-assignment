//Perform sorting of an array in descending order.
// Sample array
let numbers = [5, 2, 8, 1, 6];

// Sorting in descending order
numbers.sort(function(a, b) {
    return b - a;
});

console.log(numbers);
