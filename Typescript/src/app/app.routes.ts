import { Routes } from '@angular/router';
import { HomeComponent } from './pages/home/home.component';
import { TarefasComponent } from './pages/tarefas/tarefas.component';
import { CalculadoraComponent } from './pages/calculadora/calculadora.component';
import { ContadorComponent } from './pages/contador/contador.component';
import { NotFoundComponent } from './pages/not-found/not-found.component';

export const routes: Routes = [
    {path:"", component:HomeComponent},
    {path:"TarefasComponent", component:TarefasComponent},
    {path:"CalculadoraComponent", component:CalculadoraComponent},
    {path:"ContadorComponent", component:ContadorComponent},
    {path:"**", component:NotFoundComponent}
];
