import { Component, Input, input } from '@angular/core';

@Component({
  selector: 'app-card-pricing',
  standalone: true,
  imports: [],
  templateUrl: './card-pricing.component.html',
  styleUrl: './card-pricing.component.css'
})
export class CardPricingComponent {
  @Input()
  gameType:string = ""
  @Input()
  price:string = "";
}
