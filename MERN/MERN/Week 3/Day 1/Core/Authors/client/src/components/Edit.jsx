import React, { useState, useEffect } from 'react'
import axios from "axios"
import { useNavigate , useParams} from 'react-router-dom'

function Edit() {
    const { id } = useParams()
    const nav = useNavigate()
    const [name, setName] = useState("")
    const [errors, setError] = useState([])
    useEffect(() => {
        axios.get("http://localhost:5000/api/authors/" + id)
            .then(res => {
                console.log(res)
                setName(res.data.name)
            })
            .catch(err => console.error(err))
    }, [id])
    const SubmitHandler = (e) => {
        e.preventDefault()
        axios.patch("http://localhost:5000/api/authors/" + id, { name })
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
            <form onSubmit={(e) => SubmitHandler(e)}>
                <h1>Edit Author</h1>
                <div>
                    <label htmlFor="">Name</label>
                    <input type="text" value={name} onChange={(e) => setName(e.target.value)} />
                </div>
                {
                    errors.map((err, i) => {
                        return <p style={{ color: "red" }} key={i}>{err}</p>
                    })
                }
                <button >submit</button>
            </form>
        </div>
    )
}
export default Edit