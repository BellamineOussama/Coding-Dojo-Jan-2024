import axios from "axios";
import React, { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";

const Infos = () => {
    const { category, id } = useParams();
    const [infos, setInfos] = useState({});
    const nav = useNavigate();


    useEffect(() => {
        axios
            .get(`https://swapi.dev/api/${category}/${id}`)
            .then((res) => {
                setInfos(res.data);
            })
            .catch((err) => {
                nav("*");
            });
    }, [category, id, nav]);

    
    if (category === "people") {
        return (
            <div className="text-start">
                <h1>{infos.name}</h1>
                <p><strong>Height:</strong> {infos.height}</p>
                <p><strong>Mass :</strong>{infos.mass}</p>
                <p><strong>Hair Color :</strong>{infos.hair_color}</p>
                <p><strong>Skin Color :</strong>{infos.skin_color}</p>
            </div>
        );
    } else
        return (
            <div className="text-start">
                <h1>{infos.name}</h1>
                <p>Climate: {infos.climate}</p>
                <p>Terrain: {infos.terrain}</p>
                <p>Surface Water:{infos.surface_water}</p>
                <p>Population:{infos.population}</p>
            </div>
        );
};

export default Infos;