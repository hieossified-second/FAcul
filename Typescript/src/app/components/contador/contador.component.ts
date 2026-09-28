import { Component, input } from '@angular/core';

@Component({
  selector: 'app-contador',
  imports: [],
  templateUrl: './contador.component.html',
  styleUrl: './contador.component.css'
})
export class ContadorComponent {
  titulo = input("Contador")
  contagem: number= 0

  aumentar(){
    this.contagem = this.contagem + 1
  }

  diminuir(){
      this.contagem = this.contagem - 1
  }

  

}
