import { Link, Outlet } from "react-router-dom";

export default function Root() {
  return (
    <>
      {/* all the other elements */}
      <div id="detail">

      <div id="sidebar">
        {/* other elements */}

        <nav class="navbar navbar-expand-lg bg-body-tertiary">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">My App</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav">
        <li class="nav-item">
        <Link class="nav-link active" to={`workouts`}>View Workouts</Link>
          {/* <a class="nav-link active" aria-current="page" href="#">Home</a> */}
        </li>
        <li class="nav-item">
        <Link class="nav-link active" to={`courses`}>View Courses</Link>
        </li>

        <li class="nav-item">
        <Link class="nav-link active" to={`addcourse`}>Add Course</Link>
        </li>
      </ul>
    </div>
  </div>
</nav>


      

        {/* other elements */}
      </div>
        <Outlet />
      </div>
    </>
  );
}
