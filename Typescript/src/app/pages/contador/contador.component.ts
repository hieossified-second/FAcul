import { Component, input } from '@angular/core';
import { CabecalhoComponent } from '../../component/cabecalho/cabecalho.component';
import { ContagemComponent } from '../../component/contagem/contagem.component';

@Component({
  selector: 'app-contador',
  imports: [CabecalhoComponent, ContagemComponent],
  templateUrl: './contador.component.html',
  styleUrl: './contador.component.css'
})
export class ContadorComponent {

}
