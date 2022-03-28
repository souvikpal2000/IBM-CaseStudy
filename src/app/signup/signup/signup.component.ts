import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {

  message = '';
  alert = '';

  constructor() { }

  ngOnInit(): void {
  }

  onClickSubmit = (value:any) => {
    console.log(value);
    if(value.password != value.confirmpassword){
      this.message = "Password doesn't match";
      this.alert = "alert-danger";
    }
    else{
      this.message = "User Registered";
      this.alert = "alert-success";
    }
  }

}
