import { Component } from '@angular/core';

@Component({
  selector: 'app-card',
  standalone: true,
  imports: [],
  templateUrl: './card.component.html',
  styleUrl: './card.component.css'
})
export class CardComponent {

  produtos:string[] = []
  menuType:string = "superuserXXXX"
  constructor(){
    this.produtos = [
      "mouse",
      "teclado",
      "fonte"
    ]
  }

  ngOnInit(): void {}

  adicionar(){
    //alert("produto adicionado")
    this.produtos.push("produto dinamico");
  }

  remover(index:number){
    //alert(index)
    this.produtos.splice(index,1)
    //this.produtos.pop();
  }

}
