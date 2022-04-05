import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class BooksServiceService {

  constructor(private httpClient: HttpClient) { }

  public getBooks() : Observable<any>
  {
    return this.httpClient.get<any>('http://localhost:8089/getbooks');
  }

  public deleteBook(bid: number) : Observable<any>
  {
    return this.httpClient.get(`http://localhost:8089/deletebook/${bid}`);
  }
}
