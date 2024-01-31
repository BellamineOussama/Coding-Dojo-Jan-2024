function min_to_front(arr){
    // find the index of the min value
    var min_index = 0;
    for(var i = 1; i < arr.length; i++){ 
        if(arr[i] < arr[min_index]){
            min_index = i;
        }
    }
    // replace the min value in the start of the array 
    var min_value = arr[min_index];
    while(min_index > 0){
        arr[min_index]= arr[min_index -1];
        min_index--;
    }
    arr[0] = min_value;
    return arr;
}
var arr = [2, 6, 1, 4];
console.log(min_to_front(arr));



