import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { TitleComponent } from './pages/index/title/title.component';
import { CardComponent } from './pages/portifolio/card/card.component';

export const routes: Routes = [
  {path:'',component:TitleComponent,pathMatch:'full'},
  //portifolio
  //portifolio/1
  {path:'portifolio', component: CardComponent, children:[
      {path:':id', component: CardComponent},
  ]},
  {path:'portifolio/:id',component:CardComponent,pathMatch:'prefix'},
  {path:'**',redirectTo:''}
];

@NgModule({
  imports: [ RouterModule.forRoot(routes)],
  exports: [ RouterModule ]
})

export class AppRoutingModule {}
