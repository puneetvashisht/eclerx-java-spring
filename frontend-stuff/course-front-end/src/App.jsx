import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import ViewCourses from './ViewCourses'
import AddCourse from './AddCourse'
// import './App.css'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <h2>Container Component</h2>
      <hr/>
      <AddCourse></AddCourse>
      <hr/>
      <ViewCourses></ViewCourses>
    </>
  )
}

export default App
