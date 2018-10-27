import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { CatetoriaComponent } from './catetoria/catetoria.component';
import { LugarTutisticoComponent } from './lugar-tutistico/lugar-tutistico.component';
import { CronogramaComponent } from './cronograma/cronograma.component';
import { PaqueteTuristicoComponent } from './paquete-turistico/paquete-turistico.component';

@NgModule({
  declarations: [
    AppComponent,
    CatetoriaComponent,
    LugarTutisticoComponent,
    CronogramaComponent,
    PaqueteTuristicoComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
