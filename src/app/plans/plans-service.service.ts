import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { SubPlan } from './subplan';
import { Observable } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class PlansServiceService {

  constructor(private httpClient: HttpClient) { }

  public getPlans() : Observable<any>
  {
    return this.httpClient.get<any>('http://localhost:8089/getplans');
  }
}
