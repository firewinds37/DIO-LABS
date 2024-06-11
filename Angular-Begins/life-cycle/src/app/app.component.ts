import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { CheckSampleComponent } from "./check-sample/check-sample.component";

@Component({
    selector: 'app-root',
    standalone: true,
    templateUrl: './app.component.html',
    styleUrl: './app.component.css',
    imports: [RouterOutlet, CheckSampleComponent]
})
export class AppComponent {
  title = 'life-cycle';
  isAliveCheckSample:boolean = true

  disposeCheckSample():void
  {
    this.isAliveCheckSample = false;
  }
}
