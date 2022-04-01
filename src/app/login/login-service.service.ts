import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpHeaders } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class LoginServiceService {

  constructor(private httpClient: HttpClient) { }

  public authentication(username: string, password: string) : Observable<any>
  {
    let body = new URLSearchParams();
    body.set('username', username);
    body.set('password', password); 
    
    const headers = new HttpHeaders().set('Content-Type', 'application/x-www-form-urlencoded')
    
    return this.httpClient.post('http://localhost:8089/login', body.toString(), {headers, responseType: 'text'});
  }

}
