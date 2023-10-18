import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Carro } from './carro';

@Injectable({
  providedIn: 'root'
})
export class CarroService {
  //URL Obtiene el listado de todos los carros en el backend
  private baseURL = "http://localhost:8080/api/v1/carros";

  constructor(private httpClient : HttpClient) { }

  //Metodo que obtiene el listado de todos los carros en el backend
  obtenerListaDeCarros():Observable<Carro[]>{

    return this.httpClient.get<Carro[]>(`${this.baseURL}`);
  }


  //Metodo que registra un carro en el backend
  registrarCarro(carro:Carro):Observable<Object>{
    return this.httpClient.post(`${this.baseURL}`, carro);

  }

  //Metodo que actualiza un carro en el backend
  actualizarCarro(id:number, carro:Carro):Observable<Object>{
    return this.httpClient.put(`${this.baseURL}/${id}`, carro);
  }

  obtenerCarroPorId(id:number):Observable<Carro>{
    return this.httpClient.get<Carro>(`${this.baseURL}/${id}`);
  }

  eliminarCarro(id:number):Observable<Object>{
    return this.httpClient.delete(`${this.baseURL}/${id}`);
  }

}
