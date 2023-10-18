import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ListaCarrosComponent } from './lista-carros/lista-carros.component';
import { HttpClientModule } from '@angular/common/http';
import { RegistrarCarroComponent } from './registrar-carro/registrar-carro.component';
import { FormsModule } from '@angular/forms';
import { ActualizarCarroComponent } from './actualizar-carro/actualizar-carro.component';
import { CarroDetallesComponent } from './carro-detalles/carro-detalles.component';

@NgModule({
  declarations: [
    AppComponent,
    ListaCarrosComponent,
    RegistrarCarroComponent,
    ActualizarCarroComponent,
    CarroDetallesComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
