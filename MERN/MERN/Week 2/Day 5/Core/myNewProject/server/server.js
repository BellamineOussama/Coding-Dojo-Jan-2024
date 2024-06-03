const express = require('express');
require('dotenv').config();
const cors = require('cors');
const app = express();


app.use( express.json() );
app.use( express.urlencoded({ extended: true }) );
app.use(cors())

//! Import Routes
require("./routes/product.routes")(app);


//! CONNECT WITH DATABASE 
require('./config/mongoose.config')

app.listen(process.env.port, () =>{
    console.log(">>>> SERVER IS RUNNING ON PORT", process.env.port, "<<<<");
    console.log(`http://localhost:${process.env.port}`)
})