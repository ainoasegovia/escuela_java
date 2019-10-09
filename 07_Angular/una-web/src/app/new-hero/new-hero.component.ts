import { Component, OnInit } from '@angular/core';
import { HeroService } from '../hero.service';
import { Hero } from '../model/hero';

@Component({
  selector: 'app-new-hero',
  templateUrl: './new-hero.component.html',
  styleUrls: ['./new-hero.component.css']
})
export class NewHeroComponent implements OnInit {

  newHero: Hero;

  constructor(private heroSrv: HeroService) { }

  ngOnInit() {
    this.newHero = new Hero();
  }
  createHero(): void {
    this.heroSrv.add(this.newHero);
    // Crear uno nuevo para la siguiente vez
    this.newHero = new Hero();
  }
}
