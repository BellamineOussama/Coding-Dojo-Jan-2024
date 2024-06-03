class Card {
    constructor(name,cost){
        this.name = name;
        this.cost = cost;
    }
}
class Unit extends Card {
    constructor(name, cost , power, res){
        super(name,cost);
        this.power = power ;
        this.res = res;
    }

    attack(target) {
        if (target instanceof Unit) {
            target.res -= this.power;
        } else {
            throw new Error('Target must be a Unit to attack!');
        }
    }
}
class Effect extends Card {
    constructor(name, cost, text, stat, magnitude) {
        super(name, cost);
        this.text = text; 
        this.stat = stat; 
        this.magnitude = magnitude; 
    }
    play(target) {
        if (target instanceof Unit) {
            target[this.stat] += (this.text === 'increase') ? this.magnitude : 
                                (this.text === 'decrease') ? -this.magnitude :
                                0;
        } else {
            throw new Error('Target must be a Unit to apply effect!');
        }
    }
}

const redBeltNinja = new Unit("Red Belt Ninja", 3, 3, 4);
const hardAlgorithm = new Effect("Hard Algorithm", 2, "increase", "res", 3);
//console.log(redBeltNinja.res);
hardAlgorithm.play(redBeltNinja);
// console.log(redBeltNinja.res);
const blackBeltNinja = new Unit("Black Belt Ninja", 4, 5, 4);

const unhandledPromiseRejection = new Effect("Unhandled Promise Rejection", 1, "decrease", "res", 2);

unhandledPromiseRejection.play(redBeltNinja);
console.log(redBeltNinja.res);

const pairProgramming = new Effect("Pair Programming", 3, "increase", "power", 2);
pairProgramming.play(redBeltNinja);
console.log(redBeltNinja.power);

redBeltNinja.attack(blackBeltNinja);
console.log(blackBeltNinja.res);

console.log("Red Belt Ninja:", redBeltNinja);
console.log("Black Belt Ninja:", blackBeltNinja);