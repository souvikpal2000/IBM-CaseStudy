import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-books',
  templateUrl: './books.component.html',
  styleUrls: ['./books.component.css']
})
export class BooksComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  books = [
    {
      bookTitle: "Deathly Hallows ",
      url: "https://tse3.mm.bing.net/th/id/OIP.ZZKj9QmRQEBU8H40N5tKhQHaFm?w=276&h=209&c=7&r=0&o=5&dpr=1.5&pid=1.7",
      description: "The title of the book refers to three mythical objects featured in the story."
    },
    {
      bookTitle: "Alice in Wonderland",
      url: "https://tse2.mm.bing.net/th/id/OIP.EuVtLtoyJqzFqRZvItew4QHaJn?w=203&h=263&c=7&r=0&o=5&dpr=1.5&pid=1.7",
      description: "Alice, now 19 years old, follows a rabbit in a blue coat to a magical wonderland."
    },
    {
      bookTitle: "The Merchant of Venice",
      url: "https://tse3.mm.bing.net/th/id/OIP.g-pn5Mxnie7AINRe530RGgHaLy?w=198&h=315&c=7&r=0&o=5&dpr=1.5&pid=1.7",
      description: " Venetian Story of Love, Romance, and Comedy "
    }
  ]
}
