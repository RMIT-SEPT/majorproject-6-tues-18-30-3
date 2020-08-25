import React, { Component } from 'react'
import {link} from "react-router-dom";

const CreateAccountButton=() => {
    return (
        <React.Fragment>
        <link
        to="/AddWorker"  
        className="btn btn-lg btn-info">
        Create an Account
        </link>
        </React.Fragment>  
    )
};
export default CreateAccountButton;