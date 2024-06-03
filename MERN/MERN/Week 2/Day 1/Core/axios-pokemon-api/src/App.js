import { useState } from 'react';
import axios from 'axios';
import './App.css';

function App() {
  const [fetchPokemon, setFetchPokemon] = useState([]);

  const AxiosPokemon = () =>{
    axios.get("https://pokeapi.co/api/v2/pokemon")
    .then((response) =>{
      console.log("AXIOS API RESPONSE ",  response);
      setFetchPokemon(response.data.results); 
    })
    .catch((error) => console.log("ERROR",error));
  }


  return (
    <div className="App">
      <button className='butt' onClick={AxiosPokemon}>Fetch Pokemon</button>
        <ul>
          {fetchPokemon.map((pok, index) => (
            <li key={index}>{pok.name}</li>
          ))}
        </ul>
    </div>
  );
}

export default App;
