const { FindAllAuthors, CreateNewAuthor, FindOneAuthorById, UpdateOneAuthor, deleteOneAuthor } = require("../controllers/author.controller")


module.exports = (app) => {
    app.get('/api/authors', FindAllAuthors)
    app.post('/api/authors/new', CreateNewAuthor)
    app.get('/api/authors/:id', FindOneAuthorById)
    app.put('/api/authors/:id', UpdateOneAuthor)
    app.delete('/api/authors/:id', deleteOneAuthor)
}