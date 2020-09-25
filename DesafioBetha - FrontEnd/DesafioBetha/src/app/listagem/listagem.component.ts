import { Component, OnInit, Optional } from '@angular/core';
import { Employee } from '../employee';
import { EmployeeService } from '../employee.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-listagem',
  templateUrl: './listagem.component.html',
  styleUrls: ['./listagem.component.css']
})
export class ListagemComponent implements OnInit {

  employees: Employee[];
  opcao: ['Todos'];
  constructor(private employeeService: EmployeeService, private router: Router) { }

  ngOnInit(): void {
    this.getEmployees();
  }

  private getEmployees() {
    this.employeeService.getEmployeesList().subscribe(data => {
      this.employees = data;
    })
  }

  updateEmployee(id: number) {
    this.router.navigate(['alterar', id]);
  }

  viewEmployee(id: number) {
    this.router.navigate(['detalhes', id]);
  }

  //filtragem incompleta 
  filterUser(dados: Employee, opcao) {
    let pendentes = dados.pendente_fl;
    console.log(opcao)
    if (pendentes === 'Pendente') {
      return pendentes
    }
    if (pendentes === 'Concluído') {
      return pendentes
    }

  }
}

