import  swal  from 'sweetalert2';
import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Carro } from '../carro';
import { CarroService } from '../carro.service';


@Component({
  selector: 'app-actualizar-carro',
  templateUrl: './actualizar-carro.component.html',
  styleUrls: ['./actualizar-carro.component.css']
})
export class ActualizarCarroComponent {
  id:number;
  carro:Carro = new Carro();
  constructor(private carroService:CarroService,private router:Router,private route:ActivatedRoute) { }

  ngOnInit(): void {
    this.id = this.route.snapshot.params['id'];
    this.carroService.obtenerCarroPorId(this.id).subscribe(dato =>{
      this.carro = dato;
    },error => console.log(error));
  }

  irAlaListaDeCarros(){
    this.router.navigate(['/carros']);
    swal.fire('Carro actualizado',`El carro ${this.carro.placa} ha sido actualizado con exito`,`success`);
  }

  onSubmit(){
    this.carroService.actualizarCarro(this.id,this.carro).subscribe(dato => {
      this.irAlaListaDeCarros();
    },error => console.log(error));
  }

}
