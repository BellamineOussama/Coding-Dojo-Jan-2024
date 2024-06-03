
module.exports = (app) =>{
    app.get('/', (req, res) =>{
        console.log(req.params)
        res.json({message :'Server is Up and Running', ok: true});
    });
}