import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { PlayerComponent } from './player/player.component';
import { DoorCardsComponent } from './door-cards/door-cards.component';
import { DoorCardComponent } from './door-card/door-card.component';
import { CombatComponent } from './combat/combat.component';
import { LevelComponent } from './level/level.component';

@NgModule({
  declarations: [
    AppComponent,
    PlayerComponent,
    DoorCardsComponent,
    DoorCardComponent,
    CombatComponent,
    LevelComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
