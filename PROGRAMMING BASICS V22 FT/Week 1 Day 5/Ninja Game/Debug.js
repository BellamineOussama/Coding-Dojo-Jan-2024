// Debug the following code that removes negative values from an array

function removeNegatives(arr) { // remove var from array function declaration
    for(var i = 0; i < arr.length; i++) { 
        if(arr[i] <= 0) { //  i change =< to <=
            arr[i] = arr.pop(); // replace arr[j] with arr[i]
            i--;
        }
    }
    return arr; // replace array to become arr 
}
var result = removeNegatives([3, 7, -23, 0, 2.5, -4]);
console.log(result);