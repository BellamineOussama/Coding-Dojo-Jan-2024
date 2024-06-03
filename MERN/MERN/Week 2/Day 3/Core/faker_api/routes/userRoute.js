
const createUser  = require('../models/createUser')

module.exports = (app) =>{

    app.post('/api/users/new', (req, res) => {
        console.log(req.body);
        req.body = createUser()
        res.status(200).json({ newUser: req.body, message : "User Created successfully", ok:true})
    })
}

