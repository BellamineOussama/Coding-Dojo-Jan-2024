// Create a function called pizzaOven that returns a JavaScript (Pizza) Object :
function pizzaOven(crustType, sauceType, cheeses, toppings) {
    // create a varible called pizza to store the reset of items
    var pizza = {
        crustType : crustType,
        sauceType : sauceType,
        cheeses : cheeses,
        toppings : toppings,
    };
    return pizza;
}
// Create a pizza with: "deep dish", "traditional", ["mozzarella"], and ["pepperoni", "sausage"]
var P1 = pizzaOven("deep dish", "traditional", ["mozzarella"], ["pepperoni", "sausage"]);
console.log(P1);

// Create a pizza with: "hand tossed", "marinara", ["mozzarella", "feta"], and ["mushrooms", "olives", "onions"]
var P2 = pizzaOven("hand tossed", "marinara", ["mozzarella", "feta"], ["mushrooms", "olives", "onions"] );
console.log(P2);

// Create 2 more pizzas with any toppings we like!
var P3 = pizzaOven("stuffed crust", "bbq sauce", ["cheddar", "gouda"], ["chicken", "red onions", "cilantro"]);
console.log(P3);
var P4 = pizzaOven("deep dish", "pesto", ["mozzarella", "feta"], "sea fruits");
console.log(P4);

// Bonus Challenge: Create a function called randomPizza that uses Math.random() to create a random pizza!
function randomPizza() {
    var crustTypes = ["deep dish", "hand tossed", "thin crust", "stuffed crust"];
    var sauceTypes = ["traditional", "marinara", "pesto", "bbq sauce"];
    var cheesesList = ["mozzarella", "feta", "goat cheese", "gouta"];
    var toppingsList = ["pepperoni", "sausage", "mushrooms", "olives", "onions", "sea fruits", "chicken"];
    var pizza = {
        crustType: crustTypes[Math.floor(Math.random() * crustTypes.length)],
        sauceType: sauceTypes[Math.floor(Math.random() * sauceTypes.length)],
        cheeses: [cheesesList[Math.floor(Math.random() * cheesesList.length)]],
        toppings: [toppingsList[Math.floor(Math.random() * toppingsList.length)]],
    };
    return pizza;
}
var randomPizza = randomPizza();
console.log(randomPizza);
