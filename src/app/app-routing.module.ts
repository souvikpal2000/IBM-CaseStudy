import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BooksModule } from './books/books.module';
import { HomeModule } from './home/home.module';
import { LoginModule } from './login/login.module';
import { PageNotFoundModule } from './page-not-found/page-not-found.module';

const routes: Routes = [
  {path: "home", loadChildren: () => HomeModule},
  {path: "books", loadChildren: () => BooksModule},
  {path: "login", loadChildren: () => LoginModule},
  {path: "**", loadChildren: () => PageNotFoundModule}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
