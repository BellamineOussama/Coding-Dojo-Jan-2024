

// write a function called howMuchLeftOver with numberOfPieces and numberOfPeople as parameters
function howMuchLeftOverCake(numberOfPieces,numberOfPeople){
    // Calculate how many pieces of cake will remain  after everyone has had their share. 
    var remainigPieces = numberOfPieces % numberOfPeople ; 
    // Conditionally print a response based on the number of people and the number of pieces 
    if(remainigPieces === 0){
        console.log("No leftovers for you!");
    }
    else if (remainigPieces <= 2){
        console.log("You have some leftovers");
    }
    else if (remainigPieces <=5){
        console.log("You have leftovers to share");
    }
    else{
        console.log("Hold another party!");
    }
    
}
var numberOfPeople = 5; 
var numberOfPieces = 12; 
howMuchLeftOverCake(numberOfPieces , numberOfPeople);

