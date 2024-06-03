import React from 'react';
import './Task.css'

const Task = ({ tasks , updateTask, deleteTask }) => {
    // console.log(tasks);
return (
    <div>
        {tasks.map((task, index) => 
            <div key={index} className='contanier'>
            <h4 style={{ textDecoration: task.status ? 'line-through' : 'none' }}>{task.title}</h4>
            <input type="checkbox" checked={task.status} onChange={(e)=> updateTask(index) } />
            <button className='butt' onClick={() => deleteTask(index)} >Delete</button>
            </div>)}
    </div>
    );
}

export default Task;