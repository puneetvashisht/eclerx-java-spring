import { useState } from "react"

const ViewCourses = () =>{

    const [courses, setCourses] = useState([]);

    const deleteCourse = (id) => {
        console.log('Delete the course with id '+ id);
        fetch('http://localhost:9090/api/v1/courses/' + id  , 
            {
                method: "DELETE"
            }
        )
        .then(res=>{
            console.log(res.status)
            // return res.json();
        })
        // .then(data =>console.log(data))
    }

    const loadCourses = () => {
        console.log('Load the courses from the server!')
        fetch('http://localhost:9090/api/v1/courses')
        .then(res=>res.json())
        .then(data=> {
            console.log(data)
            setCourses(data)
        })
    }

    let courseList = courses.map((c,i) => (<tr key={c.id}>
        <th scope="row">{c.id}</th>
        <td>{c.title}</td>
        <td>{c.instructor}</td>
        <td>{c.price}</td>
        <td><button onClick={()=>deleteCourse(c.id)} className="btn btn-danger">X</button></td>
        </tr>))

    return (
        <div>
            <h2>View The Courses</h2>
            <button onClick={loadCourses}>Load Courses</button>
          

        <table className="table">
            <thead>
                <tr>
                <th scope="col">#</th>
                <th scope="col">Title</th>
                <th scope="col">Instructor</th>
                <th scope="col">Price</th>
                <th scope="col">Actions</th>
                </tr>
            </thead>
            <tbody>
                {courseList}
                
            </tbody>
            </table>
        </div>
        
    )
}

export default ViewCourses;