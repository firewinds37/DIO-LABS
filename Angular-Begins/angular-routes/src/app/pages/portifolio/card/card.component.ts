import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-card',
  standalone: true,
  imports: [],
  templateUrl: './card.component.html',
  styleUrl: './card.component.css'
})
export class CardComponent implements OnInit{

  constructor(private activeRoute:ActivatedRoute, private navigator:Router){

    //http://localhost:4200/portifloio/{1}
    this.activeRoute.params.subscribe(
      result => console.log(result)
    )

    //http://localhost:4200/portifolio/1?{name=teste}&{token=123}
    this.activeRoute.queryParams.subscribe(
      result => console.log(result)
    )

    this.activeRoute.firstChild?.params.subscribe(
      result => console.log(result)
    )

  }

  ngOnInit(): void {

    //deveria redirecionar para a raiz depois de 5 segundos
    /*
    setInterval(()=>{
      this.navigator.navigate(['/'])
    },5000)*/
  }
}
