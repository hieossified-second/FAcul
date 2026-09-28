import { Component, input } from '@angular/core';
import { RouterLink } from '@angular/router';
import { HomeComponent } from '../../pages/home/home.component';

@Component({
  selector: 'app-cabecalho',
  imports: [RouterLink],
  templateUrl: './cabecalho.component.html',
  styleUrl: './cabecalho.component.css'
})
export class CabecalhoComponent {
  titulo = input("Titulo")
}
