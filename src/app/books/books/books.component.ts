import { Component, OnInit } from '@angular/core';
import { Books } from '../books';
import { BooksServiceService } from '../books-service.service';

@Component({
  selector: 'app-books',
  templateUrl: './books.component.html',
  styleUrls: ['./books.component.css']
})
export class BooksComponent implements OnInit {

  books: Books[]=[];

  constructor(private bookservice: BooksServiceService) { }

  ngOnInit(): void {
    this.getBooks();
  }

  getBooks = () => {
    this.bookservice.getBooks().subscribe(response => {
      console.log(response);
      this.books = response;
    })
  }
}
