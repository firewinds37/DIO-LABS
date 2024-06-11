import { Component, Inject } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterOutlet } from '@angular/router';
import { CardComponent } from "./card/card.component";
import { CompAtributosComponent } from "./comp-atributos/comp-atributos.component";
import { FormControl, FormGroup, FormsModule} from '@angular/forms'
//import { FormControl, ReactiveFormsModule } from '@angular/forms';
import { ReactiveFormsModule } from '@angular/forms';


@Component({
    selector: 'app-root',
    standalone: true,
    templateUrl: './app.component.html',
    styleUrl: './app.component.css',
    imports: [RouterOutlet, CardComponent, CompAtributosComponent, FormsModule, ReactiveFormsModule]
})


export class AppComponent {
  title = 'diretivas-proj';
  isAliveCard = true;
  estilo: any;



}
