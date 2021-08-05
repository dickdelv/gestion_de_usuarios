import { Component, OnInit } from '@angular/core';
import { Persona, Rol } from 'src/app/Modelo/Persona';
import { ServiceService } from 'src/app/Service/service.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-editar',
  templateUrl: './editar.component.html',
  styleUrls: ['./editar.component.css']
})
export class EditarComponent implements OnInit {
  public selectrol: Rol ={id_rol:0, nombre:'' };
  rol: Rol[];
  constructor(private router:Router, private service:ServiceService) { }

  ngOnInit(): void {
    this.service.getRol().subscribe((data) => {
      this.rol = data;
    });
  }

}
