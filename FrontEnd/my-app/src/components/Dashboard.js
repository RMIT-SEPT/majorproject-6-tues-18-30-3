import React, { Component } from 'react'
import "bootstrap/dist/css/bootstrap.min.css";
import './sidebar.css';
import './login/Login.js';
import Team from './TeamMember';
import Contact from './Aboutme/Contact';
import Signup from './login/Signup';
import Schedule from './Schedule';
import Login from './login/Login';
import AccountForm from './Account/addAccount';
import{
  BrowserRouter as Router, Route, Link
} from "react-router-dom";



class Dashboard extends Component {
    render() {
        return (
          <Router>
            <div>
            <head>Dashboard</head>
            <body>
                <div class="d-flex" id="wrapper">
                <div class="bg-light border-right" id="sidebar-wrapper">
                <div class="sidebar-heading">Dashboard </div>
                <div class="list-group ">
                  <ul>
                    <li>
                      <Link to="/schedule">Schedule</Link>
                    </li>
                    <li>
                      <Link to="/team">Team</Link>
                    </li>
                    <li>
                      <Link to="/about">Contact</Link>
                    </li>
                    <li>
                      <Link to ="/accountForm">Account Form</Link>
                    </li>
                  </ul>
                </div>
                </div>
               
   
                <div id="page-content-wrapper">

      <nav class="navbar navbar-expand-lg navbar-light bg-light border-bottom">
        <Link to="/login"><button class="btn btn-primary" id="log-in" >Login</button></Link>
        <Link to="/signup"><button class="btn btn-secondary pull-right" id="sign-up" >Signup</button></Link> 
        
      </nav>

      <div class="container-fluid">
        
        <Route exact path="/about" component={Contact}/>
        <Route exact path="/signup" component={Signup}/>
        <Route exact path="/schedule" component={Schedule}/>
        <Route exact path="/team" component={Team}/>
        <Route exact path="/login" component={Login}/>
        <Route exact path="/accountForm" component={AccountForm}/>
  
      </div>
    </div>
    </div>
    </body>
    </div>
        </Router>
        )
        }
        }
 

export default Dashboard;