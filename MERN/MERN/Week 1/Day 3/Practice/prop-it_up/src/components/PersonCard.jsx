import React from 'react'

const PersonCard = (props) => {
  return (
    <div className="person-card" >
        <h1>{props.firstName}{props.lastName}</h1>
        <p>Age : {props.age}</p>
        <p>Hair color : {props.hairColor}</p>
    </div>
  )
}

export default PersonCard