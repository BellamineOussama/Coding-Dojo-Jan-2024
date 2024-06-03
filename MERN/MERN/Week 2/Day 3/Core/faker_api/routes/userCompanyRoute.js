const createUser  = require('../models/createUser')
const createCompany = require('../models/createCompany')

module.exports = (app) =>{

    app.post('/api/user/company', (req, res) => {
        req.body = createUser()
        req.body = createCompany()
        res.status(200).json({ newUser: req.body,  newCompany: req.body, message: "User and Company Created successfully", ok:true})
    })
}