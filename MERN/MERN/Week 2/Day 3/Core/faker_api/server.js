const express = require('express');
const app = express();

app.use( express.json() );
app.use( express.urlencoded({ extended: true }) );

//! Import Routes
    const healthRoute = require('./routes/healthRoute')
    healthRoute(app)
    const userRoute = require('./routes/userRoute')
    userRoute(app)
    const companyRoute = require('./routes/companyRoute')
    companyRoute(app)
    const  userCompanyRoute = require('./routes/userCompanyRoute')
    userCompanyRoute(app)




app.listen(8000, () =>{
    console.log(">>>> SERVER IS RUNNING ON PORT 8000 <<<<");
})