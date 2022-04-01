import { Component, Input, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { CookieService } from 'ngx-cookie-service';
import { LoginServiceService } from '../login-service.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  message= '';
  alert= '';
  @Input() cookieValue = '';

  constructor(private loginService: LoginServiceService, private route: Router, private cookieService: CookieService) { }

  ngOnInit(): void {
    this.cookieValue = this.cookieService.get('loggedIn');
    if(this.cookieValue){
      this.route.navigate(['/books']);
    }
  }

  onClickSubmit = (form : NgForm) => {
    console.log(form.value);
    this.authentication(form.value.username, form.value.password);
  }

  authentication = (username:string, password: string) => {
    this.loginService.authentication(username, password)
    .subscribe((response: any) => {
        console.log(response);
        if(response === 'Incorrect Password'){
            this.message = response;
            this.alert = "alert-danger";
        }
        else if(response === "You're not Registered"){
            this.message = response;
            this.alert = "alert-warning";
        }
        else{
            this.cookieService.set( 'loggedIn', 'true' );
            this.cookieService.set( 'status', response );
            this.route.navigate(['/books']).then(() => {
              window.location.reload();
            });;
        }
    })
  }
}



