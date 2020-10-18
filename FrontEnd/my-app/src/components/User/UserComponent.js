import React from 'react';
import UserService from './UserService';

class UserComponent extends React.Component {

    constructor(props){
        super(props)
        this.state = {
            users:[]
        }
    }

    componentDidMount(){
        UserService.getUsers().then((response) => {
            this.setState({ users: response.data})
        });
    }
    
    render (){
        return (
            <div>
                <table className = "white">
                <thead>
                    <tr>


                        <td> User ID </td>
                        <td> User First Name</td>
                        <td> User Last Name</td>
                        <td> User Address</td>
                        <td> User Email</td>
                    </tr>
                </thead>
                <tbody>
                    {
                        this.state.users.map(
                            user =>
                            <tr key = {user.id}>
                            <td> {user.id}</td>
                            <td> {user.firstName}</td>
                            <td> {user.lastName}</td>
                            <td> {user.address}</td>
                            <td> {user.email}</td>
                            </tr>
                        )
                    }

                </tbody>
                </table>



            </div>
        )
    }

}

export default  UserComponent