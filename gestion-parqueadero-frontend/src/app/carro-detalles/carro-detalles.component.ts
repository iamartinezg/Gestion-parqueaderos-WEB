import { CarroService } from './../carro.service';
import { Component, OnInit } from '@angular/core';
import { Carro } from '../carro';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-carro-detalles',
  templateUrl: './carro-detalles.component.html',
  styleUrls: ['./carro-detalles.component.css']
})
export class CarroDetallesComponent implements OnInit {
  

  id:number;
  carro:Carro;
  constructor(private route:ActivatedRoute,private CarroServicio:CarroService) {
   }
  
  ngOnInit(): void {
    this.id = this.route.snapshot.params['id'];
    this.carro = new Carro();
    this.CarroServicio.obtenerCarroPorId(this.id).subscribe(data=>{
      this.carro = data;
    });
  }

}
