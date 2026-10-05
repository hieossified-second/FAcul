import { Component } from '@angular/core';
import { CabecalhoComponent } from '../../component/cabecalho/cabecalho.component';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-calculadora',
  imports: [CabecalhoComponent, FormsModule],
  templateUrl: './calculadora.component.html',
  styleUrl: './calculadora.component.css'
})
export class CalculadoraComponent {
  num1 = 0;
  num2 = 0;
  resultado = 0;

  somar(){
    this.resultado = this.num1 + this.num2;
  }

  subtrair(){
    this.resultado = this.num1 - this.num2;
  }

  multiplicar(){
    this.resultado = this.num1 * this.num2;
  }

  dividir(){
    this.resultado = this.num1 / this.num2;
  }

}
