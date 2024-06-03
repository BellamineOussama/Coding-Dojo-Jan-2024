
import { useState } from 'react';
import './App.css';
import Task from './components/Task';
import Form from './components/Form';

function App() {
  const [tasks, setTasks] = useState([{title:"Get Python black belt", status :true}]);
  const addTask = (newTask) =>{
    setTasks([...tasks, newTask]);
  }
  const updateTask = (index) =>{
    const tasksupdate = [...tasks]
    tasksupdate[index].status = !tasks[index].status;
    setTasks(tasksupdate);
  }
  const deleteTask = (index) => {
    const newTasks = [...tasks];
    newTasks.splice(index, 1);
    setTasks(newTasks);
  }

  return (
    <div className="App">
      <Form addTask={addTask}/>
      <Task tasks={tasks} updateTask={updateTask} deleteTask={deleteTask} />
    </div>

  );
}

export default App;
