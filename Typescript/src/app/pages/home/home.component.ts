import { Component } from '@angular/core';
import { CabecalhoComponent } from '../../component/cabecalho/cabecalho.component';
import { RouterLink } from '@angular/router';

@Component({
  selector: 'app-home',
  imports: [CabecalhoComponent, RouterLink],
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})
export class HomeComponent {

}
