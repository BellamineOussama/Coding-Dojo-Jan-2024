
const ProductController = require ("../controllers/product.controller");

module.exports= (app) => {
    app.get("/api/products", ProductController.findAllProduct);
    app.get("/api/products/:id", ProductController.findOneProduct);
    app.post("/api/products", ProductController.createProduct);
    app.delete("/api/products/:id", ProductController.deleteOneProduct)
}


