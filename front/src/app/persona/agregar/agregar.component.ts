import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { Persona, Rol } from 'src/app/Modelo/Persona';
import { ServiceService } from 'src/app/Service/service.service';

@Component({
  selector: 'app-agregar',
  templateUrl: './agregar.component.html',
  styleUrls: ['./agregar.component.css']
})
export class AgregarComponent implements OnInit {
  
  public selectrol: Rol ={id_rol:0, nombre:'' };
  public pers: Persona={id_usuario:0, id_rol:0, nombre:'', activo:''};
  rol: Rol[];
 
  constructor(private router:Router, private service:ServiceService) { }

  ngOnInit(): void{
    this.service.getRol().subscribe((data) => {
      this.rol = data;
    });
  }

  guardar(formpersona: NgForm): void{

    this.service.createpersona(formpersona.value)
    .subscribe(data=>{
      alert("Cliente creado con exito");
      window.location.reload();
    })
  }

  

}
