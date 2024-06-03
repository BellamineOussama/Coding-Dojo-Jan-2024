const express = require('express');
require('dotenv').config();
const app = express();


app.use( express.json() );
app.use( express.urlencoded({ extended: true }) );




//! Import Routes
require('./routes/jokes.routes')(app);


//! CONNECT WITH DATABASE 
require('./config/mongoose.config')


app.listen(process.env.port, () =>{
    console.log(">>>> SERVER IS RUNNING ON PORT", process.env.port, "<<<<");
})