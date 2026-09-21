import { Component } from '@angular/core';
import { RouterLink } from '@angular/router';
import { CabecalhoComponent } from '../../components/cabecalho/cabecalho.component';
import { ContagemComponent } from '../../component/contagem/contagem.component';

@Component({
  selector: 'app-contador',
  imports: [RouterLink, CabecalhoComponent, ContagemComponent],
  templateUrl: './contador.component.html',
  styleUrl: './contador.component.css'
})
export class ContadorComponent {

}
