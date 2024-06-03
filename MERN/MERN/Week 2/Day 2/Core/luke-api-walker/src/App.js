import { Route, Routes } from 'react-router-dom';
import Search from './components/Search';
import Infos from './components/Infos';
import Error from './components/Error';
import "./App.css";


function App() {
  return (
    <div className="App container d-flex align-items-center justify-content-center flex-column">
      <p>
      <Search />
      </p>
      <p></p>
      <div>
      <Routes>
        <Route path="/:category/:id" element={<Infos />} />
        <Route path="*" element={<Error />} />
        <Route path="/" element={null} />
      </Routes>
      </div>
    </div>
  );
}
export default App;
