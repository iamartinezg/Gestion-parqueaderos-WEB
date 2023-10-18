import { NgModule, Component } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ListaCarrosComponent } from './lista-carros/lista-carros.component';
import { RegistrarCarroComponent } from './registrar-carro/registrar-carro.component';
import { ActualizarCarroComponent } from './actualizar-carro/actualizar-carro.component';
import { CarroDetallesComponent } from './carro-detalles/carro-detalles.component';

const routes: Routes = [
  {path : 'carros',component: ListaCarrosComponent},
  {path : '',redirectTo: '/carros',pathMatch: 'full'},
  {path : 'registrar-carro',component: RegistrarCarroComponent},
  {path : 'actualizar-carro/:id',component: ActualizarCarroComponent},
  {path : 'carro-detalles/:id',component: CarroDetallesComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
