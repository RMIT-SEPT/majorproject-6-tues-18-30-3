import React, { Component } from 'react'
import './login.css';
class Login extends Component {
    render() {
        return (
            <div>
                <form action="action_page.php" method="post">
                    <div class="container">
                        <label for="uname"><b>Username</b></label>
                        <input type="text" placeholder="Enter Username" name="uname" required></input>

                        <label for="psw"><b>Password</b></label>
                        <input type="password" placeholder="Enter Password" name="psw" required></input>

                        <button type="submit">Login</button>
                        
                    </div>

                    <div class="container" style="background-color:#f1f1f1">
                        <button type="button" class="cancelbtn">Cancel</button>
                        <span class="psw">Forgot <a href="#">password?</a></span>
                    </div>
                    
                </form>
                
            </div>
        )
    }
}
export default Login;