const { default: mongoose } = require("mongoose");


const JokeSchema = new mongoose.Schema({
    setup:{
        type: String,
        required: [true, "{PATH} is required"],
        minlength:[10, '{PATH} must be at least 10 🚫🚫🚫']
    },
    punchline:{
        type: String,
        required:[true, "{PATH} is required !"],
        minlength:[3, 'punchline length must be at least 3 🚫🚫🚫']
    }

},{timestamps:true});

const Joke = mongoose.model('Joke',JokeSchema);
module.exports = Joke;
