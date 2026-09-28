import { Routes } from '@angular/router';
import { HomeComponent } from './pages/home/home.component';
import { ContagemComponent } from './pages/contagem/contagem.component';
import { NotFoundComponent } from './pages/not-found/not-found.component';
import { TarefasComponent } from './pages/tarefas/tarefas.component';

export const routes: Routes = [
    {path:"", component:HomeComponent},
    {path: "ContagemComponent", component:ContagemComponent}, 
    {path: "TarefasComponent", component:TarefasComponent},
    {path: "**", component:NotFoundComponent}
];
   
