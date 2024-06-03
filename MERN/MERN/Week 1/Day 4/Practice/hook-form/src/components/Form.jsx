import React, {useState} from 'react';
import "./form.css"

const Form = (props) => {
    const [firstName, setFirstName]= useState("");
    const [lastName, setLastName]= useState("");
    const [email, setEmail]= useState("");
    const [password, setPassword]= useState("");
    const [confirmPassword, setConfirmPassword]= useState("");
    const createUser = (e) => {
        e.preventDefault();
        const newUser = { firstName, lastName, email, password, confirmPassword };
        console.log("Welcome", newUser);
    	setFirstName("");
        setLastName("");
    	setEmail("");
    	setPassword("");
        setConfirmPassword("");

    }
return (
    <div>
        <form onSubmit={createUser} className='container mt-5'>
            <div className='form-group'>
                <label>First Name : </label>
                <input type='text' className="form-control form-control-sm  " value={firstName} onChange={(e)=>setFirstName(e.target.value)}/>
            </div>
            <div className='form-group'>
                <label>Last Name : </label>
                <input type='text' className="form-control form-control-sm" value={lastName} onChange={(e) => setLastName(e.target.value)}/>
            </div>
            <div className='form-group'>
                <label>Email : </label>
                <input type='email' className="form-control form-control-sm" value={email} onChange={(e) => setEmail(e.target.value)}/>
            </div>
            <div className='form-group'>
                <label>Password : </label>
                <input type='text' className="form-control form-control-sm" value={password} onChange={(e) => setPassword(e.target.value)}/>
            </div>
            <div className='form-group'>
                <label>Confirm Password : </label>
                <input type='text' className="form-control form-control-sm" value={confirmPassword} onChange={(e) => setConfirmPassword(e.target.value)}/>
            </div>
            <button type="submit" className="btn btn-primary">Create User</button>
        </form>
        <br />
        <div>
            <h5> Your Form Data</h5>
            <br />
            <p>First Name: {firstName}</p>
            <p>Last Name: {lastName}</p>
            <p>Email: {email}</p>
            <p>Password: {password}</p>
            <p>Confirm Password: {confirmPassword}</p>
        </div>

    </div>
    
)
}

export default Form