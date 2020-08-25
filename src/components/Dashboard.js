import React, { Component } from 'react'
import "bootstrap/dist/css/bootstrap.min.css";
import './sidebar.css';
import './login/Login.js';
import Appointment from './Account/addAccount';

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
                    <a href="./Account/addAccount.js" target="_self" class="list-group-item ">Appointment</a>
                    <a href="./Account/CustomerAccount.js" target="_self" class="list-group-item ">Customer</a>
                    <a href="./Services.js" target="_self" class="list-group-item ">Services</a>
                    <a href="./TeamMember.js" target="_self" class="list-group-item ">Team</a>
                    <a href="./Aboutme/Contact.js" target="_self" class="list-group-item ">Contact</a>
                </div>
                </div>
   
                <div id="page-content-wrapper">

      <nav class="navbar navbar-expand-lg navbar-light bg-light border-bottom">
        <button class="btn btn-primary" id="menu-toggle">Back</button>

        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>

        <button class="btn btn-secondary pull-right" id="login"  onclick = "./login/Login.js">Login </button>
        <button class="btn btn-secondary pull-right" id="sign-up" onclick = "./login/Signup.js">Signup</button>
      </nav>

      <div class="container-fluid">
        <Appointment/>
  
      </div>
    </div>
    </div>
    </body>
    </div>

        )
        }
        }
 

export default Dashboard;