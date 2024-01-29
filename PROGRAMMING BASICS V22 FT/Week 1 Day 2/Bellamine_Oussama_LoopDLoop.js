//How do we know we need a loop here? To monitor the candy based on runner distance 
// What's the starting point of the loop? ==> initalizing variable 
// When should the loop stop? ==> When we stop giving candy : when it reaches 6 miles
// How will the loop know when to stop? ==> the condition tell him : when it exceeds 6 miles 
// What's incrementing for each iteration of the loop? ==> the loop increment the runner distance on the treadmill for each iteration
// What variables do we need? ==> we need 1 variable



// Step 2: Build out the loop.
for(var i=0; i<=6; i++){
    if(i>=2){
        console.log(i + " miles : give a piece of candy.");
    }
    else{
        console.log(i + " keep running to reach 2 miles");
    }
}
console.log("Treadmill session complete.")


// Write a loop that pops out a piece of candy every 2 miles through 6 miles :
for(var i=2; i<=6; i+=2 ){
    console.log(i + " miles : give a piece of candy.");
}

// Ninja Bouns : 
var speed = 8;
for(var i=2; i<=6; i+=2){
    if(i%2===0 && speed>5.5){
        console.log(i + " miles : give a piece of candy with a speed of " + speed + " miles per hour !");
    }
}






