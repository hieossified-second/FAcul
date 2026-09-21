import { Routes } from '@angular/router';
import { HomeComponent } from './pages/home/home.component';
import { ContatoComponent } from './pages/contato/contato.component';
import { ContadorComponent } from './pages/contador/contador.component';

export const routes: Routes = [
    {path: "", component:HomeComponent},
    {path: "ContatoComponent", component:ContatoComponent},
    {path: "ContadorComponent", component:ContadorComponent},
];
