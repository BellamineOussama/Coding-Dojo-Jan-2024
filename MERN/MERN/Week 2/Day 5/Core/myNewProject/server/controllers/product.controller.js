const Product = require('../models/product.model')


module.exports = {
    createProduct: (req, res) => {
        Product.create(req.body)
            .then(newCreatedProduct => {
                console.log(`New Product created with sucess`);
                res.json({ data: newCreatedProduct, message: 'New Product created with success' })
            })
            .catch(error => {
                console.log(error)
                res.json(error.errors)
            })
    },
    findAllProduct: (req, res) => {
        Product.find()
            .then(products => {
                console.log('All Products found with success');
                res.json({ products, message: 'All Products found with success' })
            })
            .catch(error => console.log(error))

    },

    findOneProduct: (req, res) => {
        Product.findById({ _id: req.params.id })
            .then(oneProduct => {
                if (!oneProduct) {
                    res.json({ error: 'Product not found' })
                } else {
                    res.json({ oneProduct, message: 'Product found with success' })
                }
            })
            .catch(error => {
                console.log(error);
                res.json({ error })
            })
    },
    update: (req, res) => {
        Product.findByIdAndUpdate({ _id: req.params.id }, req.body, { new: true, runValidators: true })
            .then(productUpdated => {
                res.json({ productUpdated, message: 'Product updated with success' })
            })
            .catch(error => {
                console.log(error);
                res.json(error.errors)
            })
    },
    deleteOneProduct: (req, res) => {
        Product.findByIdAndDelete({ _id: req.params.id })
            .then(productDeleted => {
                if (!productDeleted) {
                    res.json({ error: 'Product not found' })
                } else {
                    res.json({ productDeleted, message: 'Product deleted with success' })
                }
            })
            .catch(error => {
                console.log(error);
                res.json({ error })
            })
    }
}
