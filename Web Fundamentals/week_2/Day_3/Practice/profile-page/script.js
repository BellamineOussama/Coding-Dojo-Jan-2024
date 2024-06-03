

// remove the user form the reqests list
var x = document.querySelector("#add");
var y = document.querySelector("#delete");
function removeUser(){
    var one = document.querySelector("#one");
    one.remove();
    x.innerText--;
    y.innerText++;
}
function removeUsers(){
    var two = document.querySelector("#two");
    two.remove();
    x.innerText--;
}
// change user name
var userName = document.querySelector("#name");
function changeUserName() {
    userName.innerText= "Oussama Bellamine";
}



