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
        console.log(`my name is ${this.name}\nStrength : ${this.strength} \nSpeed : ${this.speed} \nHealth : ${this.health}`);
    }
    drinkSake(){
        console.log(this.health += 10);
    }
}
class Sensai extends Ninja {
    constructor(name){
        super(name);
        this.health = 200;
        this.speed = 10;
        this.strength = 10;
        this.wisdom = 10;
    }
    speakWisdom(){
        super.drinkSake();
        console.log('What one programmer can do in one month, two programmers can do in two months.');
    }
}
const superSensei = new Sensai('Master Splinter');
superSensei.speakWisdom();
superSensei.showStats();