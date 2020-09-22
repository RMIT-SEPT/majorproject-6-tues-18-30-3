import React from 'react';
import UserService from './UserServices';
 
class TeamMember extends React.Component {
 
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
                <h1 className = "text-center"> Member List </h1>
                <table className = "table table-stripted">
                <thead>
                    <tr>
 
                        <td> Member ID </td>
                        <td> Member First Name</td>
                        <td> Member Last Name</td>
                        <td> Member Phone Number</td>
                        <td> Member Email</td>
                        <td> Member Availability</td>
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
                            <td> {user.phoneNumber}</td>
                            <td> {user.email}</td>
                            <td> {user.availability}</td>
                            </tr>
                        )
                    }
                </tbody>
                </table>
            </div>
        )
    }
 
}
export default TeamMember;
