import React from 'react';
import { useParams } from 'react-router-dom';

const Input = () => {
    const { input } = useParams()


    return (
        <div>

            {
                isNaN(input) ?
                    <h1>The Word is: {input}</h1>
                    :
                    <h1>The Number is : {input}</h1>
            }
        </div>
    )
}

export default Input