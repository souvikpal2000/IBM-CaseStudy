import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { BooksRoutingModule } from './books-routing.module';
import { BooksComponent } from './books/books.component';
import { BooksServiceService } from './books-service.service';
import { HttpClientModule } from '@angular/common/http';


@NgModule({
  declarations: [
    BooksComponent
  ],
  imports: [
    CommonModule,
    BooksRoutingModule,
    HttpClientModule
  ],
  providers: [BooksServiceService]
})
export class BooksModule { }
