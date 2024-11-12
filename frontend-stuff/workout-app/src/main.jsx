import * as React from "react";
import * as ReactDOM from "react-dom/client";
import {
  createBrowserRouter,
  RouterProvider,
} from "react-router-dom";
import "./index.css";
import 'bootstrap/dist/css/bootstrap.css'
import Root from "./routes/root";
import ErrorPage from "./routes/error-page";
import Contact from "./routes/contact";
import ViewWorkout from "./routes/ViewWorkout";
import ViewCourses from "./routes/ViewCourses";
import AddCourse from "./routes/AddCourse";

const router = createBrowserRouter([
  {
    path: "/",
    element: <Root />,
    errorElement: <ErrorPage />,
    children: [
      {
        path: "contacts/:contactId",
        element: <Contact />,
      },
      {
        path: "workouts",
        element: <ViewWorkout />,
      },
      {
        path: "courses",
        element: <ViewCourses />,
      },
      {
        path: "addcourse",
        element: <AddCourse />,
      },
    ],
  },
]);

ReactDOM.createRoot(document.getElementById("root")).render(
  <React.StrictMode>
    <RouterProvider router={router} />
  </React.StrictMode>
);


// import { StrictMode } from 'react'
// import { createRoot } from 'react-dom/client'
// import './index.css'
// import App from './App.jsx'

// createRoot(document.getElementById('root')).render(
//   <StrictMode>
//     <App />
//   </StrictMode>,
// )
