import { Component, input } from '@angular/core';

@Component({
  selector: 'app-contagem',
  imports: [],
  templateUrl: './contagem.component.html',
  styleUrl: './contagem.component.css'
})
export class ContagemComponent {
  titulo = input("...")
  num = 0

  aumentar(){
    this.num = this.num + 1;
  }

  diminuir(){
    if(this.num > 0){
      this.num = this.num - 1;
    }
  }
}
