import { Component, Input, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { CookieService } from 'ngx-cookie-service';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {

  cookieValue = '';
  @Input() logoutActive = true;
  role = 'user';

  constructor(private cookieService: CookieService, private route: Router) { }

  ngOnInit(): void {
    this.cookieValue = this.cookieService.get('username');
    this.role = this.cookieService.get('role');
    if(!this.cookieValue){
      this.logoutActive = false;
    }else{
      this.logoutActive = true;
    }
  }

  onLogout = () => {
    this.cookieService.delete("username");
    this.cookieService.delete("status");
    this.cookieService.delete("planid");
    this.cookieService.delete("role");
  }


}
