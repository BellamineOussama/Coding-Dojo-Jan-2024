const mongoose = require("mongoose")

const ProductSchema = new mongoose.Schema({
    title: {
        type: String,
        trim: true,
        required: [true, "{PATH} is required"],
        minLength: [3, "{PATH} must be at least 3 characters"],
    },
    price: {
        type: Number,
        trim: true,
        required: [true, "{PATH} is required"],
        minLength: [1, "{PATH} must be at least 1 number"],
    },
    description: {
        type: String,
        trim: true,
        required: [true, "{PATH} is required"],
        minLength: [3, "{PATH} must be at least 3 characters"],
    }
},
    { timestamps: true });


const Product = mongoose.model ("Product", ProductSchema);
module.exports = Product;