import { Component } from '@angular/core';
import { RouterLink } from '@angular/router';
import { CabecalhoComponent } from '../../components/cabecalho/cabecalho.component';

@Component({
  selector: 'app-home',
  imports: [RouterLink, CabecalhoComponent],
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})
export class HomeComponent {

}
