// Import des dépendances
import React, { useEffect, useState } from 'react';
import axios from 'axios';
import { useNavigate } from 'react-router-dom';
import ProductCard from './ProductCard';

const Home = () => {
    const [products, setProducts] = useState([]);
    useEffect(() => {
        axios.get('http://localhost:5000/api/products')
            .then(res => setProducts(res.data.products))
            .catch(error => console.log(error));
    }, []);

    const [newProduct, setNewProduct] = useState({ title: '', price: '', description: '' });
    const [noteError, setNoteError] = useState({});

    const navigate = useNavigate();

    const deleteProduct = (id) => {
        axios.delete(`http://localhost:5000/api/products/${id}`)
            .then(res => {
                console.log(res);
                const filteredProducts = products.filter(product => product._id !== id);
                setProducts(filteredProducts);
            })
            .catch(error => console.log(error));
    };

    const createProduct = (e) => {
        e.preventDefault();
        axios.post('http://localhost:5000/api/products', newProduct)
            .then(res => {
                console.log(res.data);
                setNewProduct({ title: '', price: '', description: '' });
                setNoteError({});
                navigate('/');
            })
            .catch(error => {
                console.log(error.response.data);
                setNoteError(error.response.data);
            });
    };

    return (
        <>
            <form onSubmit={createProduct} className="container p-3 col-6">
                {noteError.global && <p className="text-danger">{noteError.global}</p>}
                <div className="mb-3">
                    <label className="form-label">Title :</label>
                    <input type="text" className="form-control w-25" onChange={(e) => setNewProduct({ ...newProduct, title: e.target.value })} value={newProduct.title} />
                    <span className='h4 text-danger'>{noteError.title && noteError.title}</span>
                </div>
                <div className="mb-3">
                    <label className="form-label">Price :</label>
                    <input className="form-control w-25" type='number' onChange={(e) => setNewProduct({ ...newProduct, price: e.target.value })} value={newProduct.price} />
                    <span className='h4 text-danger'>{noteError.price && noteError.price}</span>
                </div>
                <div className="mb-3">
                    <label className="form-label">Description :</label>
                    <textarea className="form-control w-75" cols="6" rows="3" onChange={(e) => setNewProduct({ ...newProduct, description: e.target.value })} value={newProduct.description} />
                    <span className='h4 text-danger'>{noteError.description && noteError.description}</span>
                </div>
                <button className="btn btn-primary" disabled={noteError.title || noteError.price || noteError.description}>Create</button>
            </form>
            <div className='container p-3'>
                <div className="row">
                    {products.map(product => <ProductCard product={product} key={product._id} deleteProduct={deleteProduct} />)}
                </div>
            </div>
        </>
    );
};

export default Home;
