import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BooksModule } from './books/books.module';
import { HomeModule } from './home/home.module';
import { PlansModule } from './plans/plans.module';
import { LoginModule } from './login/login.module';
import { PageNotFoundModule } from './page-not-found/page-not-found.module';
import { SignupModule } from './signup/signup.module';

const routes: Routes = [
  {path: "", redirectTo: "home", pathMatch: "full" },  
  {path: "home", loadChildren: () => HomeModule},
  {path: "books", loadChildren: () => BooksModule},
  {path: "plans", loadChildren: () => PlansModule},
  {path: "signup", loadChildren: () => SignupModule},
  {path: "login", loadChildren: () => LoginModule},
  {path: "**", loadChildren: () => PageNotFoundModule}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
