import { Injectable } from '@angular/core';
import { Hero } from './model/hero';
import { HEROES } from './model/array-heros';
import { MessageService } from './message.service';

@Injectable({
  providedIn: 'root'
})
export class HeroService {

  arrayHeroes: Hero[];

  constructor(private messageSrv: MessageService) { 
    let i = 0;
    this.arrayHeroes = [];
    for (i = 0; i < HEROES.length; i++)
      this.arrayHeroes.push(HEROES[i]);
  }

  getHeroes() : Hero[] {
    this.messageSrv.add("HeroService: capturando heroes");
    return this.arrayHeroes;
  }
  add(newHero: Hero): void {
    this.arrayHeroes.push(newHero);
  }
  getHero(id: number): Hero {
    let hero = this.arrayHeroes.find( hero => hero.id === id );
    return hero;
  }
}
