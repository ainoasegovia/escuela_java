import { Component, OnInit } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Hero } from '../model/hero';

@Component({
  selector: 'app-cliente-rest',
  templateUrl: './cliente-rest.component.html',
  styleUrls: ['./cliente-rest.component.css']
})
export class ClienteRestComponent implements OnInit {

  private urlUsers = "http://localhost:8084/CRUD_Vista_JSTL/api/users";
  private lista: any[];
  httpOptions = {
    headers: new HttpHeaders({ 'Content-Type': 'application/json' })
  };
  constructor(private http: HttpClient) { }

  ngOnInit() {
    this.getHeroes().subscribe(objetos => this.lista = objetos);
  }
  /** GET heroes from the server */
  getHeroes(): Observable<Object[]> {
    return this.http.get<Object[]>(this.urlUsers);
  }
  enviar() {
    this.http.post(this.urlUsers, 
      {name: "ANGULAR", 
      password: "P1234",
      email: "angular@io.io",
      age: "22"
    }, this.httpOptions).subscribe((resp) => alert(resp));
  }
}
