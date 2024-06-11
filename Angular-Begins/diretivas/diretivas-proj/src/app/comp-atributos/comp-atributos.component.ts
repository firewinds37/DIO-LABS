import { Component, Input, OnInit, Output, model, output } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { ReactiveFormsModule } from '@angular/forms';

@Component({
  selector: 'app-comp-atributos',
  standalone: true,
  imports: [],
  templateUrl: './comp-atributos.component.html',
  styleUrl: './comp-atributos.component.css'
})
export class CompAtributosComponent implements OnInit {
  estilo:string = "enabled"
  corFundo:string = "red"
  cordafonte:string = "yellow"
  valor:string = ""
  public userProfileForm = new FormGroup({
    last_name: new FormControl(''),
  });



  ngOnInit(): void {

  }



  trocar()
  {
    if (this.estilo == "enabled")
      this.estilo = "disabled"
    else
      this.estilo = "enabled"

  }

  getValorTexto()
  {
    alert(this.userProfileForm.controls.last_name.value)
  }

  updateUserProfile()
  {
    alert(this.userProfileForm.controls.last_name.value);
  }


}
