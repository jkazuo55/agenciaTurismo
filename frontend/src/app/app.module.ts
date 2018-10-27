import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { CatetoriaComponent } from './catetoria/catetoria.component';

@NgModule({
  declarations: [
    AppComponent,
    CatetoriaComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
