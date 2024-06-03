import React, { useState } from 'react'
import './Form.css'

const Form = ({addTask}) => {
    const [task, setTask]=useState("");
    const formHandler = (e) =>{
        e.preventDefault();
        if (task.trim() !== ""){
        addTask({title:task, status:false});
        setTask("");
        }
    }
return (
    <div>
        <form className='Cont' onSubmit={formHandler}>
            <input type="text" placeholder='Get MERN black belt.' className='custom-input' value={task} onChange={(e)=> setTask(e.target.value)} />
            <button className='buttn' >Add</button>
        </form>
    </div>
)
}

export default Form