import { Component, Input, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { CookieService } from 'ngx-cookie-service';
import { AddBookServiceService } from '../add-book-service.service';
import { Book } from '../book';

@Component({
  selector: 'app-addbook',
  templateUrl: './addbook.component.html',
  styleUrls: ['./addbook.component.css']
})
export class AddbookComponent implements OnInit {

  image: File = {} as File;
  pdf: File = {} as File;
  message = '';
  role = 'user';

  constructor(private addBookService: AddBookServiceService, private cookieService: CookieService, private route: Router) { }

  ngOnInit(): void {
    if(this.cookieService.get("role") !== 'admin'){
      this.route.navigate(['/home']);
    }
  }

  onImageChange = (event : any) => {
    console.log(event.target.files[0]);
    this.image = event.target.files[0];
  }

  onPdfChange = (event: any) => {
    console.log(event.target.files[0]);
    this.pdf = event.target.files[0];
  }

  onClickSubmit = (form: NgForm) => {
    const obj = new Book(0,form.value.title,form.value.author,form.value.publisher,form.value.pages,form.value.category,form.value.description,"assets/books/"+this.image.name,"assets/books/"+this.pdf.name);
    console.log(obj)
    this.addBookService.postFile(this.image, this.pdf).subscribe();
    this.addBookService.addBookData(obj).subscribe((response) => {
      this.message = response;
    });
    form.reset();
  } 


}
