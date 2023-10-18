import { CarroService } from './../carro.service';
import { Component, OnInit } from '@angular/core';
import { Carro } from '../carro';

import { Component as ComponenteAngular } from '@angular/core';
import { Carro as CarroModelo } from '../carro';
import { Router } from '@angular/router';

@ComponenteAngular({
  selector: 'app-lista-carros',
  templateUrl: './lista-carros.component.html',
  styleUrls: ['./lista-carros.component.css']
})
export class ListaCarrosComponent implements OnInit{

  carros: CarroModelo[] = []; // Lista de carros
  
  constructor(private carroService: CarroService,private router:Router) {}

  ngOnInit(): void {
    this.obtenerCarros();
  }

  actualizarCarro(id: number){
    this.router.navigate(['actualizar-carro', id]);
  }
  private obtenerCarros() {
    this.carroService.obtenerListaDeCarros().subscribe(dato => {
      this.carros = dato;
    });
  }
  eliminarCarro(id: number){
    this.carroService.eliminarCarro(id).subscribe(dato => {
      console.log(dato);
      this.obtenerCarros();
    })
  }

  verDetallesDelCarro(id:number){
    this.router.navigate(['carro-detalles',id]);


  }

}
