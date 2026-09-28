import { Component, input } from '@angular/core';
import { ContadorComponent } from '../../components/contador/contador.component';
import { CabecalhoComponent } from '../../components/cabecalho/cabecalho.component';

@Component({
  selector: 'app-contagem',
  imports: [ContadorComponent, CabecalhoComponent],
  templateUrl: './contagem.component.html',
  styleUrl: './contagem.component.css'
})
export class ContagemComponent {

}
