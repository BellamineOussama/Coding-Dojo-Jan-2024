import React from 'react'
import './DisplayColor.css'

const DisplayColor = ({col}) => {
  return (
    <div className='box' style={{backgroundColor:col}}></div>
  )
}

export default DisplayColor