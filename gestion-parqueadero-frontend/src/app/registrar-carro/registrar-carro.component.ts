import { CarroService } from './../carro.service';
import { Component, OnInit } from '@angular/core';
import { Carro } from '../carro';
import { Router } from '@angular/router';
import swal from 'sweetalert2';

@Component({
  selector: 'app-registrar-carro',
  templateUrl: './registrar-carro.component.html',
  styleUrls: ['./registrar-carro.component.css']
})
export class RegistrarCarroComponent implements OnInit {

  carro: Carro = new Carro();
  constructor(private CarroServicio: CarroService, private router: Router) { }

  ngOnInit(): void {
  }

  guardarCarro() {
    this.CarroServicio.registrarCarro(this.carro).subscribe(dato => {
      console.log(dato);
      this.irALaListaDeCarros();
    },error => console.log(error));
  }

  irALaListaDeCarros(){
    this.router.navigate(['/carros']);
    swal.fire('Carro guardado','Carro registrado con exito en el sistema','success');
  }

  onSubmit() {
    this.guardarCarro();
  }

}