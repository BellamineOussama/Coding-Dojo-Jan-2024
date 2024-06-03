import React, { useState, useEffect } from 'react';
import axios from "axios";
import {  useParams } from 'react-router-dom';



function Show() {
    const { id } = useParams();
    const [author, setAuthor] = useState({});

    useEffect(() => {
        axios.get(`http://localhost:5000/api/authors/${id}`)
            .then(res => {
                setAuthor(res.data);
            })
            .catch(err => console.error(err));
    }, [id]);

    return (
        <div>
            <p>Name: {author.name}</p>
        </div>
    );
}

export default Show;