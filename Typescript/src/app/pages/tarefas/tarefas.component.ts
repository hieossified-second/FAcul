import { Component } from '@angular/core';
import { CabecalhoComponent } from '../../components/cabecalho/cabecalho.component';

@Component({
  selector: 'app-tarefas',
  imports: [CabecalhoComponent],
  templateUrl: './tarefas.component.html',
  styleUrl: './tarefas.component.css'
})
export class TarefasComponent {
 minhastarefas: Tarefas[] = [
    {
      id: 1,
      titulo: 'Aprender angular',
      descricao: 'Estudar angular',
      prazo: '10/10/2026',
      concluido: false
    },
    {
      id: 1,
      titulo: "Criar for",
      descricao: "Estudar angular",
      prazo: "10/10/2026",
      concluido: false
    },
    {
      id: 1,
      titulo: "fazer tabelas",
      descricao: "Estudar angular",
      prazo: "10/10/2026",
      concluido: false
    }
 ]
}

type Tarefas = {
  id: number,
  titulo: string,
  descricao: string,
  prazo: string,
  concluido: boolean
}
