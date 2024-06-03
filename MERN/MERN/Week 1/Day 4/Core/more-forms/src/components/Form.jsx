import React, { useState } from 'react';
import "./form.css"

const Form = (props) => {
    const [userName, setUserName] = useState({
        firstName: "",
        lastName: "",
        email: "",
        password: "",
        confirmPassword: "",
    });

    const handleChange = (e) => {
        const { name, value } = e.target;
        setUserName(prevState => ({...prevState, [name]: value}))
    };

    return (
        <form className='container mt-5'>
            <div>
                <div className='form-group'>
                    <label>First Name : </label>
                    <input type='text' className="form-control form-control-sm" name="firstName" value={userName.firstName} onChange={handleChange} />
                </div>
                {userName.firstName && userName.firstName.length < 2 ? <p> First Name must be at least 2 characters </p> : null}
            </div>

            <div>
                <div className='form-group'>
                    <label>Last Name : </label>
                    <input type='text' className="form-control form-control-sm" name="lastName" value={userName.lastName} onChange={handleChange} />
                </div>
                {userName.lastName && userName.lastName.length < 2 ? <p> Last Name must be at least 2 characters </p> : null}
            </div>

            <div>
                <div className='form-group'>
                    <label>Email : </label>
                    <input type='email' className="form-control form-control-sm" name="email" value={userName.email} onChange={handleChange} />
                </div>
                {userName.email && userName.email.length > 0 && userName.email.length < 5 ? <p> Email must be at least 5 characters </p> : null}
            </div>

            <div>
                <div className='form-group'>
                    <label>Password : </label>
                    <input type='text' className="form-control form-control-sm" name="password" value={userName.password} onChange={handleChange} />
                </div>
                {userName.password && userName.password.length > 0 && userName.password.length < 8 ? <p> Password must be at least 8 characters </p> : null}
            </div>

            <div>
                <div className='form-group'>
                    <label>Confirm Password : </label>
                    <input type='text' className="form-control form-control-sm" name="confirmPassword" value={userName.confirmPassword} onChange={handleChange} />
                </div>
                {userName.confirmPassword && userName.confirmPassword !== userName.password ? <p> Confirmation of Password is not required </p> : null}
            </div>

        </form>
    )
}

export default Form
