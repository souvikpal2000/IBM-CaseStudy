import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Book } from './book';

@Injectable({
  providedIn: 'root'
})
export class AddBookServiceService {

  constructor(private httpClient: HttpClient) { }

  postFile(coverPage: File, pdf: File): Observable<any> {
    const endpoint = 'http://localhost:8089/upload';
    const formData: FormData = new FormData();
    formData.append('file2', coverPage);
    formData.append('file1', pdf);
    
    return this.httpClient.post<any>(endpoint, formData);
  }

  addBookData(obj:Book): Observable<any>{
    return this.httpClient.post('http://localhost:8089/addbook', obj, {responseType: 'text'});
  }
}
