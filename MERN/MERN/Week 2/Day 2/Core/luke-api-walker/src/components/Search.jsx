import React, { useState } from "react";
import { useNavigate } from "react-router-dom";



const Search = () => {

    const [info, setInfo] = useState(0);
    const [category, setCategory] = useState("people");
    const navigate = useNavigate();

    const handleSubmit = (e) => {
        e.preventDefault();
        navigate("/" + category + "/" + info);
    };
    return (
        <>
            <form onSubmit={handleSubmit} className="searchForm d-flex gap-2 mt-2 justify-content-center align-items-center">
                <div><label>Search for :</label></div>
                <div>
                    <select onChange={(e) => setCategory(e.target.value)}>
                        <option value="people">People</option>
                        <option value="planets">Planets</option>
                    </select>
                </div>
                <div>
                    <label>ID : </label>
                    <input onChange={(e) => setInfo(e.target.value)} />
                </div>
                <div>
                    <button className="btn btn-primary">Search</button>
                </div>
            </form>
        </>
    );
};

export default Search;