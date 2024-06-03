import React from 'react'
import './Display.css'

const Display = ( {currentTab}) => {
  return (
    <fieldset>
      <h3> {currentTab} content is showing here. </h3>
    </fieldset>
  )
}

export default Display