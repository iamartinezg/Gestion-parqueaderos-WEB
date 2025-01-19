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
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import {MatButtonModule} from '@angular/material/button';
import { SingupComponent } from './singup/singup.component';
import { LoginComponent } from './login/login.component';
import {MatFormFieldModule} from '@angular/material/form-field';
import {MatInputModule} from '@angular/material/input';
import {MatSnackBarModule} from '@angular/material/snack-bar';
import {MatCardModule} from '@angular/material/card';
import {MatToolbarModule} from '@angular/material/toolbar';
import {MatIconModule} from '@angular/material/icon';
@NgModule({
  declarations: [
    AppComponent,
    ListaCarrosComponent,
    RegistrarCarroComponent,
    ActualizarCarroComponent,
    CarroDetallesComponent,
    SingupComponent,
    LoginComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    BrowserAnimationsModule,
    MatButtonModule,
    MatFormFieldModule,
    MatInputModule,
    MatSnackBarModule,
    MatCardModule,
    MatToolbarModule,
    MatIconModule,
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
