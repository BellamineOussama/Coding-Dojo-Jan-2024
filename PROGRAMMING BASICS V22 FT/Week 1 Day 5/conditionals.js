// Feature 1 :
function rewardMyself(time,day){
    if( time < 10){
        console.log("I want a latte");
    }
    else if( time >= 10 && time < 16){
        console.log("I want a hot chocolate");
    }
    else if ( time >= 16 && time <= 22){
        if( day === "WEDNESDAY"){
            console.log("I want strawberry ice cream");
        }     
        else{
            console.log("I want vanilla ice cream");
        }
    }
    else if ( time > 22 || time === 24 ){
        console.log("I dont't want anything other than sleep!");
    }
}
rewardMyself(19,"WEDNESDAY");

// Feature 2 :
function rewardMyself(time,day){
    if( time < 10){
        console.log("I want a latte");
    }
    else if ( time >= 10 && time < 15){
        console.log("I want a hot chocolate")
    }
    else if( time >= 15 && time <= 18){
        if( time % 2 === 0){
            console.log("I want vanilla ice cream");
        }
        else {
            console.log("I want a hot chocolate");
        }
    }
    else if ( time > 18 && time <= 22){
        if( day === "WEDNESDAY"){
            console.log("I want strawberry ice cream");
        }     
        else{
            console.log("I want vanilla ice cream");
        }
    }
    else if ( time > 22 || time === 24 ){
        console.log("I dont't want anything other than sleep!");
    }
}
rewardMyself(18,"MONDAY");
