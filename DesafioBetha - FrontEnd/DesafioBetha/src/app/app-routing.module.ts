import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CadastroComponent } from './cadastro/cadastro.component';
import { ListagemComponent } from './listagem/listagem.component';
import { UpdateEmployeeComponent } from './updade/update-employee.component';
import { EmployeeDetailsComponent } from './Detalhes/employee-details.component';

const routes: Routes = [
  {path: 'listagem', component: ListagemComponent},
  {path: 'cadastro', component: CadastroComponent},
  {path: '', redirectTo: 'listagem', pathMatch: 'full'},
  {path: 'alterar/:id', component: UpdateEmployeeComponent},
  {path: 'detalhes/:id', component: EmployeeDetailsComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
