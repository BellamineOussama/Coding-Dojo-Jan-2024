import React, { useState } from 'react'
import axios from "axios"
import { useNavigate } from 'react-router-dom'


const Create = () => {

    const nav = useNavigate()
    const [name, setName] = useState("")


    const [errors, setError] = useState([])

    const SubmitHandler = (e) => {
        e.preventDefault()
        axios.post("http://localhost:5000/api/authors/new", { name })
            .then(res => nav('/'))
            .catch(err => {
                const errorResponse = err.response.data.errors
                const errorArr = []
                for (const key of Object.keys(errorResponse)) {
                    errorArr.push(errorResponse[key].message)
                }
                setError(errorArr)
            })

    }

    return (
        <div>
            <form className='w-50' onSubmit={(e) => SubmitHandler(e)}>
                <h1 className='ath'>Add a new Author</h1>
                <div className='mb-3'>
                    <label className="form-input" htmlFor=""><h3>Name :</h3></label>
                    <input className='form-control' type="text" value={name} onChange={(e) => setName(e.target.value)} />
                </div>
                {
                    errors.map((err, i) => {
                        return <p style={{ color: "red" }} key={i}>{err}</p>
                    })
                }
                <button className='btn btn-warning '>Submit</button>
            </form>
        </div>
    )
}

export default Create