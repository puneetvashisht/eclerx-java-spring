import { useState } from "react"

const AddCourse = () => {

    const [title, setTitle] = useState('');
    const [instructor, setInstructor] = useState('');
    const [price, setPrice] = useState();


    const addCourse = () => {
        console.log("Add a courses" , {title, instructor, price})
        const courseObj = {title, instructor, price}
        fetch('http://localhost:9090/api/v1/courses',
            {
                method: "POST",
                headers : {
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify(courseObj)
            })
            .then(res => {
                console.log(res)
            })
    }

    return(
        <>
            <h2>Add Course Component</h2>
            <div className="mb-3">
                <label htmlFor="title" className="form-label">Title</label>
                <input type="text" value={title} onChange={(e)=>setTitle(e.target.value)} className="form-control" id="title"/>
            </div>
            <div className="mb-3">
                <label htmlFor="instructor" className="form-label">Instructor Name</label>
                <input type="text"  value={instructor} onChange={(e)=>setInstructor(e.target.value)}  className="form-control" id="instructor"/>
            </div>
            <div className="mb-3">
                <label htmlFor="price" className="form-label">Price</label>
                <input type="number"  value={price} onChange={(e)=>setPrice(e.target.value)} className="form-control" id="price"/>
            </div>
            <div className="mb-3">
                <button onClick={addCourse} className="btn btn-primary">Add Course</button>
            </div>
            
        </>
    )
}
export default AddCourse