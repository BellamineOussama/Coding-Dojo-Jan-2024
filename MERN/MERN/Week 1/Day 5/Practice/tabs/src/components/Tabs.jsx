import React from 'react'
import './Tabs.css'

const Tabs = ({tab, setCurrentTab}) => {
  const clickHandler = (t) => {
    setCurrentTab(t);
  }
  return (
    <div>
      {tab.map((t,idx) => <button  key={idx} onClick={() => clickHandler(t)}>{t}</button> )}
    </div>
  )
}

export default Tabs