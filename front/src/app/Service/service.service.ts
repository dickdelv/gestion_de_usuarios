import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Persona, Rol } from '../Modelo/Persona';

@Injectable({
  providedIn: 'root',
})
export class ServiceService {
  constructor(private http: HttpClient) {}

  Url = 'http://localhost:8080/api';

  getPersonas() {
    return this.http.get<Persona[]>(this.Url + '/lista');
  }

  createpersona(persona: Persona) {
    return this.http.post<Persona>(this.Url + '/create', persona);
  }

  getRol() {
    return this.http.get<Rol[]>(this.Url + '/listarol');
  }
  getPersonaId(id:number){
    return this.http.get<Persona>(this.Url + "/" +id);
  }
}
