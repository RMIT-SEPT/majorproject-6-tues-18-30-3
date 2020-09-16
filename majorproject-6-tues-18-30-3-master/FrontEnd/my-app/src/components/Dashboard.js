import React, { Component } from 'react'
import "bootstrap/dist/css/bootstrap.min.css";
import './Layout/sidebar.css';
import './login/signup/Login.js';
class Dashboard extends Component {
    render() {
        return (
            <div>
            <head>Dashboard</head>
            <body>

                <div class="d-flex" id="wrapper">
                <div class="bg-light border-right" id="sidebar-wrapper">
                <div class="sidebar-heading">Dashboard </div>
                <div class="list-group ">
                    <a href="./login/signup/Login" class="list-group-item ">Login</a>
                    <a href="" class="list-group-item ">Appointment</a>
                    <a href="" class="list-group-item ">Customer</a>
                    <a href="" class="list-group-item ">Services</a>
                    <a href="./TeamMember.js" class="list-group-item ">Team</a>
                    <a href="" class="list-group-item ">Contact</a>
                </div>
                </div>
   
                <div id="page-content-wrapper">

      <nav class="navbar navbar-expand-lg navbar-light bg-light border-bottom">
        <button class="btn btn-primary" id="menu-toggle">Back</button>

        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
      </nav>

      <div class="container-fluid">
        <h1 class="mt-4">MajorProject</h1>
        <p>Group 3</p><p>TUESDAY-6.30</p>
      </div>
    </div>
    </div>
    </body>
    </div>

        )
        }
        }
 

export default Dashboard;