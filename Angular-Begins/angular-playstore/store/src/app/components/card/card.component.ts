import { Component, Input } from '@angular/core';
import { CardPricingComponent } from "./card-pricing/card-pricing.component";
import { CardLabelComponent } from "./card-label/card-label.component";

@Component({
    selector: 'app-card',
    standalone: true,
    templateUrl: './card.component.html',
    styleUrl: './card.component.css',
    imports: [CardPricingComponent, CardLabelComponent]
})
export class CardComponent {
  @Input()
  gameCover:string = ""
  @Input()
  gameLabel:string = ""
  @Input()
  gameType:string = ""
  @Input()
  price:string = "";


}
