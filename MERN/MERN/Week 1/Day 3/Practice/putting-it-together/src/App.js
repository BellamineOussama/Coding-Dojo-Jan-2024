import React, { useState } from 'react';
import './App.css';
import PersonCard from './components/PersonCard';

const peopleArr = [
  { "firstName": "Jane", "lastName": "Doe", "age": 45, "hairColor": "Black" },
  { "firstName": "John", "lastName": "Smith", "age": 88, "hairColor": "Brown" }
];

function App() {
  const [peopleAge, setPeopleAge] = useState(peopleArr);

  const increaseAge = (index) => {
    const updatedPeopleAge = [...peopleAge];
    updatedPeopleAge[index].age += 1;
    setPeopleAge(updatedPeopleAge);
  };
  return (
    <div className="App">
      {peopleAge.map((person, index) => (
        <PersonCard
          key={`${person.firstName}-${person.lastName}`}
          firstName={person.firstName}
          lastName={person.lastName}
          age={person.age}
          hairColor={person.hairColor}
          onIncreaseAge={() => increaseAge(index)}
        />
      ))}
    </div>
  );
}

export default App;


