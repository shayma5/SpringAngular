import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  {path:"front",loadChildren:()=>
  import('./front-office/front-office.module').then(m=>(m).FrontOfficeModule)},
  {path:"back",loadChildren:()=>
  import('./back-office/back-office.module').then(m=>(m).BackOfficeModule)},
  {path: '', redirectTo: '/front/home', pathMatch: 'full' }
];
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { 

}
