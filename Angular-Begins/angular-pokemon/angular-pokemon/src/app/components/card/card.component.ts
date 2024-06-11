import { Component, OnInit } from '@angular/core';
import { PokemonService } from '../../../services/pokemon-service';
import { PokemonData } from '../../models/pokemonData';

@Component({
  selector: 'app-card',
  standalone: true,
  imports: [],
  templateUrl: './card.component.html',
  styleUrl: './card.component.css'
})
export class CardComponent implements OnInit {
  pokemon:PokemonData = {
    id:0,
    name:'',
    sprites:{
      front_default: ''
    },
    types:[]
  }


  name:string = "Bulbasour";
  atributesTypes:string[] = ["FIRE","ROCK"]

  constructor(
    private service:PokemonService
  ){}

  ngOnInit(): void {
    this.getPokemon("pikachu")
  }

  getPokemon(searchName:string)
  {
    console.log(searchName)

    this.service.getPokemon(searchName).subscribe({
      next: (result) => {
        /*
        console.log(result.id)
        console.log(result.name)
        console.log(result.sprites.front_default)
        console.log(result.types)
        */

        //variavel pokemon recebe dados da api
       this.pokemon = {
        id: result.id,
        name: result.name,
        sprites: result.sprites,
        types: result.types
       }
       /*
       console.log(this.pokemon.id)
       console.log(this.pokemon.name)
       console.log(this.pokemon.sprites.front_default)
       console.log(this.pokemon.types)
       */
      },

      //error: (err) => console.log(err)
    })
    //throw new Error('Method not implemented.');
  }


}
