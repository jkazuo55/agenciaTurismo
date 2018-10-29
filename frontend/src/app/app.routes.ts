import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';

import {PaqueteTradicionalComponent} from 'src/app/components/paquete-tradicional/paquete-tradicional.component';
import {CategoriaComponent} from 'src/app/components/categoria/categoria.component';
import {CronogramaComponent} from 'src/app/components/cronograma/cronograma.component';
import {LugarTuristicoComponent} from 'src/app/components/lugar-turistico/lugar-turistico.component';

const routes: Routes= [
    {path:'',component: PaqueteTradicionalComponent},
    {path:'categoria',component: CategoriaComponent},
    {path:'cronograma',component: CronogramaComponent},
    {path:'lugar-turistico',component: LugarTuristicoComponent},
    {path:'**',component: PaqueteTradicionalComponent}
];

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
})
export class AppRoutingModule{}