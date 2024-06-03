import { Route, Routes } from 'react-router-dom';
import './App.css';
import Home from './components/Home';
import Inputs from './components/Input';
import Hello from './components/Hello';



function App() {

  return (
    <div className="App">
      <Routes>
        <Route path="/home" element={<Home />} />
        <Route path="/:input" element={<Inputs />} />
        <Route path="/:hello/:color/:bg" element={<Hello />} />
      </Routes>
    </div>
  );
}

export default App;
