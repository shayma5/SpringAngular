import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { SlideComponent } from './slide/slide.component';
import { NotFoundComponent } from './not-found/not-found.component';
import { FrontOfficeComponent } from './front-office.component';

const frontroot: Routes = [
  //{path:"", component:FrontOfficeComponent},
  {path: '',
    component: FrontOfficeComponent,
    children: [  
      {path:"user",loadChildren:()=>
      import('./user/user.module').then(m=>m.UserModule)},
      {path:"universities",loadChildren:()=>
      import('./university/university.module').then(m=>m.UniversityModule)},
      {path:"home", component:SlideComponent},
      {path:"**", component:NotFoundComponent}
]}];

@NgModule({
  imports: [RouterModule.forChild(frontroot)],
  exports: [RouterModule]
})
export class FrontOfficeRoutingModule { }
