import React from 'react';
import { useParams } from 'react-router-dom';


const Hello = () => {
    const { hello, color, bg } = useParams()

    const textColor = {
        color: color,
        backgroundColor: bg
    }
    return (


        <h1 style={textColor}> The Word is : {hello}</h1>

    )
}

export default Hello