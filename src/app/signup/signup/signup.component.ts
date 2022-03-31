import { Component, Input, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { CookieService } from 'ngx-cookie-service';
import {Router} from '@angular/router';
import { Member } from 'app/member/member';
import { SubPlan } from 'app/plans/subplan';
import { MemberSubscription } from 'app/membersubscription/membersubscription';
import { SignupServiceService } from '../signup-service.service';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {

  message = '';
  alert = '';
  @Input() cookieValue = '';

  constructor(private cookieService: CookieService, private route:Router, private signupService: SignupServiceService) { }

  ngOnInit(): void {
    this.cookieValue = this.cookieService.get('planid');
    if(!this.cookieValue){
      this.route.navigate(['/plans']);
    }
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
      const memberData = new Member("",form.value.password,form.value.firstname,form.value.lastname, form.value.email, form.value.phone, "");
      const subPlan = new SubPlan(form.value.planid, 0, 0, "");
      const memberSubscription = new MemberSubscription(0,memberData,subPlan, 0, "");
      console.log(memberSubscription);

      // alert(memberSubscription);

      this.signupService.signup(memberSubscription).subscribe();

      this.message = "User Registered";
      this.alert = "alert-success";
      this.cookieService.delete("planid");
      form.reset();
    }

  }
}

