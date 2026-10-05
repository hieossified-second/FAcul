import { Component, importProvidersFrom } from '@angular/core';
import { CabecalhoComponent } from '../../component/cabecalho/cabecalho.component';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-tarefas',
  imports: [CabecalhoComponent, FormsModule],
  templateUrl: './tarefas.component.html',
  styleUrl: './tarefas.component.css'
})
export class TarefasComponent {


  minhasTarefas: Tarefas[] = []

  novoTitulo: string = '';
  novaDesc: string = '';
  novoPrazo: string = '';

  adicionarTarefas(){
    if(this.novoTitulo.trim() == ''){
      return
    }

    this.minhasTarefas.push({
      id: this.minhasTarefas.length + 1,
      titulo: this.novoTitulo,
      descricao: this.novaDesc,
      prazo: this.novoPrazo,
      concluido: false
    });

    this.novoTitulo = '';
    this.novaDesc = '';
    this.novoPrazo = '';
  }
}
  
type Tarefas = {
    id: Number,
    titulo: String,
    descricao: String,
    prazo: String,
    concluido: Boolean
};