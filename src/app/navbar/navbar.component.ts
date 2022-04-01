import { Component, Input, OnInit } from '@angular/core';
import { CookieService } from 'ngx-cookie-service';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {

  @Input() cookieValue = '';
  // @Input() loginActive = false;
  // @Input() logoutActive = false;

  constructor(private cookieService: CookieService) { }

  ngOnInit(): void {
    this.cookieValue = this.cookieService.get('loggedIn');
    // if(!this.cookieValue){
    //   this.loginActive = true;
    //   this.logoutActive = false;
    // }else{
    //   this.loginActive = false;
    //   this.logoutActive = true;
    // }
  }

  onLogout = () => {
    this.cookieService.delete("loggedIn");
  }

}
