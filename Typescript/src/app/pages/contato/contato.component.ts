import { Component } from '@angular/core';
import { RouterLink } from '@angular/router';
import { CabecalhoComponent } from '../../components/cabecalho/cabecalho.component';

@Component({
  selector: 'app-contato',
  imports: [RouterLink, CabecalhoComponent],
  templateUrl: './contato.component.html',
  styleUrl: './contato.component.css'
})
export class ContatoComponent {

}
