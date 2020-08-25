import React, { Component } from 'react'
import './signup.css'
class Signup extends Component {
    render() {
        return (
            <div>
                <form>
                <div class="container">
                <h1>Sign Up</h1>
                <p>Please fill in this form to create an account.</p>
                
                <label for="firstname"><b>First Name</b></label>
                <input type="text" placeholder="Enter FirstName" name="firstname" required></input>
                <label for="lastname"><b>Last Name</b></label>
                <input type="text" placeholder="Enter LastName" name="lastname" required></input>
                <label for="address"><b>Address</b></label>
                <input type="text" placeholder="Enter Address" name="address" required></input>
                <label for="email"><b>Email</b></label>
                <input type="text" placeholder="Enter Email" name="email" required></input>
                <label for="phonenumber"><b>Phone Number</b></label>
                <input type="text" placeholder="Enter Phone Number" name="phonenumber" required></input>
                <label for="username"><b>Username</b></label>
                <input type="text" placeholder="Enter Username" name="username" required></input>
                <label for="psw"><b>Password</b></label>
                <input type="password" placeholder="Enter Password" name="psw" required></input>

                <div class="clearfix">
                    <button type="submit" class="signupbtn">Sign Up</button>
                </div>
                </div>
                </form>
            </div>

        )
    }
}
export default Signup;