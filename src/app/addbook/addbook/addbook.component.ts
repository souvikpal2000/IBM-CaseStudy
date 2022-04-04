import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { AddBookServiceService } from '../add-book-service.service';

@Component({
  selector: 'app-addbook',
  templateUrl: './addbook.component.html',
  styleUrls: ['./addbook.component.css']
})
export class AddbookComponent implements OnInit {

  image: File = {} as File;
  pdf: File = {} as File;

  constructor(private addBookService: AddBookServiceService) { }

  ngOnInit(): void {
    
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
    console.log(form.value);
    this.addBookService.postFile(this.image, this.pdf).subscribe();
  } 
}
