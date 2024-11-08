import { useEffect, useState } from "react"

const ViewCourses = () =>{

    const [courses, setCourses] = useState([]);
    // const [priceSortDir, setPriceSortDir] = useState(true)
    useEffect(() => {
        console.log('UseEffecgt called here...');
        
      loadCourses();
    }, [])
    

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


    const sortBy = (fieldName) => {
        // let url = ''
        // setPriceSortDir(!priceSortDir)
        // if(priceSortDir){
        //     url = 'http://localhost:9090/api/v1/courses?field=price&size=10'
        // }
        // else{
        //     url = 'http://localhost:9090/api/v1/courses?field=price&sortDir=desc&size=10'
        // }
        //  = []
        // if(priceSortDir){
            // sortedCourses = courses.sort((a, b) => a[fieldName] - b[fieldName])
            let sortedCourses= courses.sort((a, b) =>
                a[fieldName].toLowerCase().localeCompare(b[fieldName].toLowerCase()));
        // }
        // else{
        //     sortedCourses = courses.sort((a, b) => b[fieldName] - a[fieldName])
        // }

        
        console.log(sortedCourses);
        setCourses(sortedCourses)
        
        // console.log('Sort course by Price');
        // fetch(url)
        // .then(res=>res.json())
        // .then(data=> {
        //     console.log(data)
        //     setCourses(data.content)
        // })
        
    }

    const loadCourses = () => {
        console.log('Load the courses from the server!')
        fetch('http://localhost:9090/api/v1/courses?field=title&size=10')
        .then(res=>res.json())
        .then(data=> {
            console.log(data)
            setCourses(data.content)
        })
    }


    console.log('Before the map render again', courses);
     
    let courseList = courses.map((c,i) => (<tr key={i}>
        <th scope="row">{c.id}</th>
        <td>{c.title}</td>
        <td>{c.instructor}</td>
        <td>{c.price}</td>
        <td><button onClick={()=>deleteCourse(c.id)} className="btn btn-danger">X</button></td>
        </tr>))

        console.log(courseList);
        

    return (
        <div>
            <h2>View The Courses</h2>
           
          

        <table className="table">
            <thead>
                <tr>
                <th scope="col">#</th>
                <th scope="col"><a onClick={()=>sortBy('title')} href="#">Title</a></th>
                <th scope="col"><a onClick={()=>sortBy('instructor')} href="#">Instructor</a></th>
                <th scope="col"><a onClick={()=>sortBy('price')} href="#">Price</a></th>
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