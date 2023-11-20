import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { HeaderComponent } from './front-office/header/header.component';
import { SlideComponent } from './front-office/slide/slide.component';
import { FooterComponent } from './front-office/footer/footer.component';
import { AppRoutingModule } from './app-routing.module';
import { NotFoundComponent } from './front-office/not-found/not-found.component';
import { FrontOfficeModule } from './front-office/front-office.module';
import { BackOfficeModule } from './back-office/back-office.module';

@NgModule({
  declarations: [
    AppComponent
   ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FrontOfficeModule,
    BackOfficeModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
