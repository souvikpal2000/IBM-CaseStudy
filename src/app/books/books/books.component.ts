import { Component, Input, OnInit } from '@angular/core';
import { CookieService } from 'ngx-cookie-service';
import { Books } from '../books';
import { BooksServiceService } from '../books-service.service';

@Component({
  selector: 'app-books',
  templateUrl: './books.component.html',
  styleUrls: ['./books.component.css']
})
export class BooksComponent implements OnInit {

  books: Books[]=[];
  cookieValue = '';
  @Input() check = false;
  role = 'user'

  constructor(private cookieService: CookieService,private bookservice: BooksServiceService) { }

  ngOnInit(): void {
    this.cookieValue = this.cookieService.get('status');
    this.role = this.cookieService.get("role");
    if(this.cookieValue === 'active'){
      this.check = true;
    }else{
      this.check = false;
    }
    //console.log(this.check);
    this.getBooks();
  }

  getBooks = () => {
    this.bookservice.getBooks().subscribe(response => {
      // console.log(response);
      this.books = response;
    })
  }

  deleteBook = (bid: number) => {
    console.log(bid);
    this.bookservice.deleteBook(bid).subscribe(() => {
      window.location.reload();
    })
  }
}
