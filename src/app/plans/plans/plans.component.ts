import { Component, Input, OnInit } from '@angular/core';
import { CookieService } from 'ngx-cookie-service';
import { PlansServiceService } from '../plans-service.service';
import { SubPlan } from '../subplan';

@Component({
  selector: 'app-plans',
  templateUrl: './plans.component.html',
  styleUrls: ['./plans.component.css']
})
export class PlansComponent implements OnInit {

  plans: SubPlan[]=[]; 
  @Input() loggedOut = false;
  @Input() message = '';
  username = ''
  constructor(private cookieService: CookieService, private planservice: PlansServiceService) { }

  ngOnInit(): void {
    this.username = this.cookieService.get("username");
    if(!this.username){
      this.loggedOut = true;
    }
    this.getPlans();
  }

  getPlans = () => {
    this.planservice.getPlans().subscribe(response => {
      // console.log(response);
      this.plans = response;
    })
  }

  setCookie = (id:any) => {
    this.cookieService.set( 'planid', id ); 
    if(this.username){
      this.message = "Plan Bought Successfully!!!!";
    }
  }
}
