import React from 'react';

const PersonCard = (props) => {
    const btnStyle = {
        padding: '12px 15px',
        fontFamily: 'Arial, sans-serif',
        fontWeight: 'bold',
        margin: '5px',
        background: 'linear-gradient(30deg, rebeccapurple, magenta)', 
        color: '#fff',
        border: 'none'
    };
    return (
    <div className="person-card">
        <h1>{props.firstName} {props.lastName}</h1>
        <p>Age : {props.age}</p>
        <p>Hair color : {props.hairColor}</p>
        <button style={btnStyle} onClick={props.onIncreaseAge}>Birthday button for {props.firstName} {props.lastName} </button>
    </div>
    )
};
export default PersonCard;

