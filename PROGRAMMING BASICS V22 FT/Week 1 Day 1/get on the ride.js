

// Stretch Feature 1 : Adjust the conditional statement to require both height (>=42 inches) and age (>=10 years old).

var minumum_Height_rider = 44 ;
var minumum_age_rider = 12 ;
if (minumum_Height_rider >=42 && minumum_age_rider >= 10){
    console.log("Get on the ride kiddo!");  
}
else{
    console.log("Sorry Kidoo. Maybe next year.")
}

/* Stretch Feature 2 :Adjust the conditional statement to require that either the height requirement (>=42 inches) 
 or the age requirement (>=10 years old) must be met in order for the console.log to say "Get on that ride, kiddo!". */

var minumum_Height_rider = 45 ;
var minumum_age_rider = 12 ;
if (minumum_Height_rider >=42 || minumum_age_rider >= 10){
    console.log("Get on the ride kiddo!");  
}
else{
    console.log("Sorry Kidoo. Maybe next year.")
}

