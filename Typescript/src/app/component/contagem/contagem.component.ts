import { Component, input } from '@angular/core';

@Component({
  selector: 'app-contagem',
  imports: [],
  templateUrl: './contagem.component.html',
  styleUrl: './contagem.component.css'
})
export class ContagemComponent {
  titulo = input("Contador")
  contagem = 0

  aumentar(){
    this.contagem = this.contagem + 1
  }

  diminuir(){
    if (this.contagem > 0){
      this.contagem = this.contagem - 1
    }
  }
}
