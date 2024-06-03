const createCompany = require('../models/createCompany')

module.exports = (app) => {

    app.post('/api/companies/new', (req, res) => {
        req.body = createCompany();
        res.status(200).json({ newCompany : req.body, message : "Company Created successfully", ok : true });
    })

}