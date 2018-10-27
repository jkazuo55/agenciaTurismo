import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { CatetoriaComponent } from './catetoria/catetoria.component';
import { LugarTutisticoComponent } from './lugar-tutistico/lugar-tutistico.component';
import { CronogramaComponent } from './cronograma/cronograma.component';

@NgModule({
  declarations: [
    AppComponent,
    CatetoriaComponent,
    LugarTutisticoComponent,
    CronogramaComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
