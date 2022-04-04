import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { AddbookRoutingModule } from './addbook-routing.module';
import { AddbookComponent } from './addbook/addbook.component';
import { AddBookServiceService } from './add-book-service.service';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';


@NgModule({
  declarations: [
    AddbookComponent
  ],
  imports: [
    CommonModule,
    AddbookRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [AddBookServiceService]
})
export class AddbookModule { }
