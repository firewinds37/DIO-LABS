import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { IndexModule } from './pages/index/index.module';
import { PortifolioModule } from './pages/portifolio/portifolio.module';
import { MenuComponent } from "./shared/menu/menu.component";
import { RouterModule } from '@angular/router';

@Component({
    selector: 'app-root',
    standalone: true,
    templateUrl: './app.component.html',
    styleUrl: './app.component.css',
    imports: [RouterOutlet, IndexModule, PortifolioModule, MenuComponent, RouterModule]
})
export class AppComponent {
  title = 'angular-routes';
}
