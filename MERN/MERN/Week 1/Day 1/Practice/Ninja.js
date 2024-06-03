class Ninja {
    constructor(name){
        this.name = name;
        this.health = 90;
        this.speed = 3;
        this.strength = 3;
    }
    sayName(){
        console.log(`My name is ${this.name}`);
    }
    showStats(){
        console.log(`my name is ${this.name}\n Strength : ${this.strength} \n Speed : ${this.speed} \n Health : ${this.health}`);
    }
    drinkSake(){
        console.log(this.health += 10) ;
    }
}
const ninja1 = new Ninja("Hyabusa");
ninja1.sayName();
ninja1.showStats();
ninja1.drinkSake();