import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { PlansRoutingModule } from './plans-routing.module';
import { PlansComponent } from './plans/plans.component';
import { HttpClientModule } from '@angular/common/http';
import { PlansServiceService } from './plans-service.service';


@NgModule({
  declarations: [
    PlansComponent
  ],
  imports: [
    CommonModule,
    PlansRoutingModule,
    HttpClientModule
  ],
  providers: [PlansServiceService]
})
export class PlansModule { }
