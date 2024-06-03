// //Level 1 :
function greet(person) {
    return console.log("good day " + person)
}
greet("oussama");

// // Level 2 : 
function greet(person,time) {
    if(time < 12){
        time = "Good morning";
    }
    else if (time < 18){
        time = "Good afternoon";
    }
    else {
        time = "Good night";
    }
    return console.log(time + person)
}
var first_name = "Oussama" ; 
var hour = 4 ;
greet(" Oussama ",8);

// Level 3 
function greet(person,time) {
    if(person === "Count Dooku"){
        console.log("I'm coming for you, Dooku!")
    }
    else{
        if(time <= 12){
            time = "Good morning";
        }
        else if (time <= 18){
            time = "Good afternoon";
        }
        else {
            time = "Good night";
        }
        return console.log(time + " " + person)
    }    
}
var first_name = "Oussama" ; 
var hour = 15 ;
greet(first_name,hour);

