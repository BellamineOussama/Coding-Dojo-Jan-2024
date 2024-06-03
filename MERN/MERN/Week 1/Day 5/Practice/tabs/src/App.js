import { useState } from 'react';
import './App.css';
import Display from './components/Display';
import Tabs from './components/Tabs';

function App() {
  const [tab, setTab] = useState(["Tab1", "Tab2", "Tab3"]);
  const [currentTab, setCurrentTab] = useState("");
  
  return (
    <div className="App">
      <Tabs tab={tab} setCurrentTab={setCurrentTab} />
      <Display  currentTab={currentTab} setTab={setTab}/>
    </div>
  );
}

export default App;
