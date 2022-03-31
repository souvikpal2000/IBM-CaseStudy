import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { MemberSubscription } from 'app/membersubscription/membersubscription';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class SignupServiceService {

  constructor(private httpClient: HttpClient) { }
  public signup(memberSubscription: MemberSubscription) : Observable<any>
  {
    return this.httpClient.post('http://localhost:8089/signup', memberSubscription);
  }
}
