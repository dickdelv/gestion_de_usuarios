import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AgregarComponent } from './persona/agregar/agregar.component';
import { EditarComponent } from './persona/editar/editar.component';
import { ListarComponent } from './persona/listar/listar.component';

const routes: Routes = [
  { path:'listar',component:ListarComponent },
  { path:'agregar',component:AgregarComponent},
  { path:'editar',component:EditarComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
