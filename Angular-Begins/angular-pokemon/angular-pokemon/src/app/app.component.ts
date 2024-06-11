import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { CardComponent } from "./components/card/card.component";
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';

@Component({
    selector: 'app-root',
    standalone: true,
    template: `
  <h1>Aula de Services</h1>
  <app-card></app-card>
  <router-outlet></router-outlet>`,
    styleUrl: './app.component.css',
    imports: [RouterOutlet, CardComponent, HttpClientModule, FormsModule ]
})
export class AppComponent {
  title = 'angular-pokemon';
}
