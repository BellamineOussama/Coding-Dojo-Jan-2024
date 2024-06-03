const mongoose = require('mongoose');


const AuthorSchema = new mongoose.Schema({
    author:{
        type: String,
        required : [true, "{PATH} is required ! "],
        minlength:[3, '{PATH} length must be at least 3 🚫🚫🚫']
    },
},{timestamps : true})

const Author = mongoose.model('Author', AuthorSchema);
module.exports = Author;