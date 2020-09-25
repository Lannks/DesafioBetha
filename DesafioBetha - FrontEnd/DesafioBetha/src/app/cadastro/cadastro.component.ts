import { Component, OnInit } from '@angular/core';
import { Employee } from '../employee';
import { EmployeeService } from '../employee.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-cadastro',
  templateUrl: './cadastro.component.html',
  styleUrls: ['./cadastro.component.css'],
})
export class CadastroComponent implements OnInit {

  employee: Employee = new Employee();


  constructor(private employeeService: EmployeeService,
    private router: Router) { }

  ngOnInit(): void {
  }

  saveEmployee() {
    this.employeeService.postEmployee(this.employee).subscribe(data => {

    },
      erro => console.log(erro))
  }

  voltar() {
    this.router.navigate(['/listagem']);
  }

  onSubmit() {
    this.saveEmployee();
  }

}
