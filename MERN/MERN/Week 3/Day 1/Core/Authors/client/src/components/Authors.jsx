import React, { useEffect, useState } from 'react'
import axios from "axios"
import { useNavigate, Link } from 'react-router-dom'

const Authors = () => {
    const [authors, setAuthors] = useState([])
    const navigate = useNavigate()
    useEffect(() => {
        axios.get("http://localhost:5000/api/authors")
            .then(res => setAuthors(res.data))
            .catch(err => console.error(err))
    }, [])
    const deleteObj = (id) => {
        axios.delete("http://localhost:5000/api/authors/delete/" + id)
            .then(res => setAuthors(authors.filter((c => c._id !== id))))
            .catch(err => console.error(err))
    }
    return (
        <div>
            <h1>Favorite Author</h1>
            <Link className='btn btn-primary' to={`/new`}>New author</Link>
            <table className='table table-bordered'>
                <thead>
                    <tr>
                        <th>Author</th>
                        <th>Actions available</th>
                    </tr>
                </thead>
                <tbody>
                    {
                        authors.map(c => (
                            <tr key={c._id}>
                                <td><Link to={`/c/${c._id}`}>{c.name}</Link></td>
                                <td className='d-flex gap-2'>
                                    <button className='btn btn-danger' onClick={() => navigate(`/update/${c._id}`)}>Edit</button>
                                    <button className='btn btn-warning' onClick={() => deleteObj(c._id)}>Delete</button>
                                </td>
                            </tr>
                        ))
                    }
                </tbody>
            </table>
        </div>
    )
}

export default Authors