import { Component, OnInit, NgModule } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { Persona, Rol } from '../../Modelo/Persona';
import { ServiceService } from '../../Service/service.service';

@Component({
  selector: 'app-listar',
  templateUrl: './listar.component.html',
  styleUrls: ['./listar.component.css'],
})
export class ListarComponent implements OnInit {
  personas: Persona[];
 
  constructor(private service: ServiceService, private router: Router) {}

  ngOnInit() {
    this.service.getPersonas().subscribe((data) => {
      this.personas = data;
    });
  }

  form = new FormGroup({
    first: new FormControl(''),
  });

  get first(): any {
    return this.form.get('first');
  }

  clearSearch() {
    this.first.reset();
  }

  public mostraragregar = false;
  public mostrareditar = false;

  muestraadd(): void {
    this.router.navigate(["agregar"]);
  }
  muestraedt(persona:Persona): void {
    
    localStorage.setItem("id_usuario", persona.id_usuario.toString());
    this.router.navigate(["editar"]);

  }

}
