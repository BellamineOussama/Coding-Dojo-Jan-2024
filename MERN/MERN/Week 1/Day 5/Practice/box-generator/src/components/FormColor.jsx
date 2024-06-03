import React, { useState } from 'react'
import DisplayColor from './DisplayColor';
import './FormColor.css';

const FormColor = () => {
  const [color, setColor] = useState(["red","blue", "purple"]);
  const [colors, setColors] = useState("");

  const addColor = (e) => {
    e.preventDefault();
    setColor([...color, colors]);
    setColors("");
  };
  
  return (
    <div >
        <form onSubmit= {(e) => addColor(e)}>
          <label>Color</label>
            <input type="text" value={colors}  onChange={(event) =>setColors(event.target.value)} />
            <button>Add</button>
        </form>
        <div className='container'>
          {color.map((col,idx) => <DisplayColor key={idx} col={col} />)}
        </div>
    </div>
  )
}

export default FormColor