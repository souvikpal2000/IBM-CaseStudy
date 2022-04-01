import { Component, Input, OnInit } from '@angular/core';
import { CookieService } from 'ngx-cookie-service';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {

  cookieValue = '';
  @Input() logoutActive = true;

  constructor(private cookieService: CookieService) { }

  ngOnInit(): void {
    this.cookieValue = this.cookieService.get('loggedIn');
    if(!this.cookieValue){
      this.logoutActive = false;
    }else{
      this.logoutActive = true;
    }
  }

  onLogout = () => {
    this.cookieService.delete("loggedIn");
    this.cookieService.delete("status");
    this.cookieService.delete("planid");
  }

}
