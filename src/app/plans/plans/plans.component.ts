import { Component, OnInit } from '@angular/core';
import { CookieService } from 'ngx-cookie-service';

@Component({
  selector: 'app-plans',
  templateUrl: './plans.component.html',
  styleUrls: ['./plans.component.css']
})
export class PlansComponent implements OnInit {

  constructor(private cookieService: CookieService ) { }

  ngOnInit(): void {
  }

  plans = [
    {
      id: "1",
      name: "Beginner's Pack",
      duration: "15 Days",
      price: "INR 199"
    },
    {
      id: "2",
      name: "Starter Pack",
      duration: "30 Days",
      price: "INR 399"
    },
    {
      id: "3",
      name: "Jumbo Pack",
      duration: "90 Days",
      price: "INR 699"
    }
  ];

  setCookie = (id:any) => {
    this.cookieService.set( 'planid', id ); 
  }
}
