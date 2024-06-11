import { Component, OnInit, DoCheck, AfterContentChecked, AfterContentInit, AfterViewChecked, AfterViewInit, OnDestroy  } from '@angular/core';

@Component({
  selector: 'app-check-sample',
  standalone: true,
  imports: [],
  templateUrl: './check-sample.component.html',
  styleUrl: './check-sample.component.css'
})
export class CheckSampleComponent implements OnInit, DoCheck, AfterContentChecked, AfterContentInit, AfterViewChecked, AfterViewInit, OnDestroy{


  quantidade:number = 0

  incrementar()
  {
    this.quantidade++
  }

  decrementar()
  {
    if (this.quantidade > 0)
      this.quantidade--
  }

  ngOnInit(): void {
    console.log('Metodo ' +this.ngOnInit.name+ 'não implementado')
  }
  ngAfterViewInit(): void {
    console.log('Metodo ' +this.ngAfterViewInit.name+ 'não implementado')
  }
  ngAfterViewChecked(): void {
    console.log('Metodo ' +this.ngAfterViewChecked.name+ 'não implementado')
  }
  ngAfterContentInit(): void {
    console.log('Metodo ' +this.ngAfterContentInit.name+ 'não implementado')
  }
  ngAfterContentChecked(): void {
    console.log('Metodo ' +this.ngAfterContentChecked.name+ 'não implementado')
  }
  ngDoCheck(): void {
    console.log('Metodo ' +this.ngDoCheck.name+ 'não implementado')
  }

  ngOnDestroy(): void {
    console.log("Good bye my friend");
  }

}
