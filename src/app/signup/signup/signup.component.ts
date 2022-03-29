import { Component, Input, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { CookieService } from 'ngx-cookie-service';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {

  message = '';
  alert = '';
  @Input() cookieValue = '';

  constructor(private cookieService: CookieService) { }

  ngOnInit(): void {
    this.cookieValue = this.cookieService.get('planid');
    console.log(this.cookieValue);
  }

  onClickSubmit = (form: NgForm) => {
    if(form.value.password != form.value.confirmpassword){
      this.message = "Password doesn't match";
      this.alert = "alert-danger";
    }
    else if(!this.cookieValue){
      this.message = `Please select a Subscription Plan from "Get Plans"`;
      this.alert = "alert-warning";
      form.reset();
    }
    else{
      console.log(form.value);
      this.message = "User Registered";
      this.alert = "alert-success";
      this.cookieService.delete("planid");
      form.reset();
    }
  }
}

