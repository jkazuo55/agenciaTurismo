import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule} from '@angular/forms';

import {HeaderComponent} from './components/header/header.component';
import {FooterComponent} from './components/footer/footer.component';
import { AppComponent } from './app.component';
import { PaqueteTradicionalComponent } from './components/paquete-tradicional/paquete-tradicional.component';
import { LugarTuristicoComponent } from './components/lugar-turistico/lugar-turistico.component';
import { CategoriaComponent } from './components/categoria/categoria.component';
import { CronogramaComponent } from './components/cronograma/cronograma.component';


import {AppRoutingModule} from './app.routes';

@NgModule({
  declarations: [
    AppComponent,
    PaqueteTradicionalComponent,
    LugarTuristicoComponent,
    CategoriaComponent,
    CronogramaComponent,
    HeaderComponent,
    FooterComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {}
