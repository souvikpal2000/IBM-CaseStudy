import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AddBookServiceService {

  constructor(private httpClient: HttpClient) { }

  postFile(coverPage: File, pdf: File): Observable<any> {
    const endpoint = '/assets/books';
    const formData: FormData = new FormData();
    formData.append('file', coverPage, coverPage.name);
    formData.append('file', pdf, pdf.name);
    
    return this.httpClient.post<any>(endpoint, formData, {responseType: 'json'});
  }
}
