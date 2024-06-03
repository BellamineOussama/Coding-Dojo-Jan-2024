const { FindAllJokes, FindOneJokeById, CreateNewJoke, UpdateOneJoke, deleteOneJoke } = require("../controllers/jokes.controller")



module.exports = (app) => {
    app.get('/api/jokes', FindAllJokes)
    app.post('/api/jokes', CreateNewJoke)
    app.get('/api/jokes/:id', FindOneJokeById)
    app.patch('/api/jokes/:id', UpdateOneJoke)
    app.delete('/api/jokes/:id', deleteOneJoke)
}