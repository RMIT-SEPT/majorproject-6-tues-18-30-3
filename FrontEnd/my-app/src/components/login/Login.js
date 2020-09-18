import React, { Component } from 'react'
import './login.css';

class Login extends Component {
    render() {
        return (
            <div>
            <form>
            <div class="container">
            <h1>Login</h1>
            <p>Please Enter your username and password.</p>
            
            <label for="username"><b>Username</b></label>
            <input type="text" placeholder="Enter Username" name="username" required></input>
            <label for="psw"><b>Password</b></label>
            <input type="password" placeholder="Enter Password" name="psw" required></input>

            <div class="clearfix">
                <button type="submit" class="signupbtn">Login</button>
            </div>
            </div>
            </form>
        </div>

        )
    }
}
export default Login;