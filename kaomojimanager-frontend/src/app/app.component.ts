import { Component, OnInit } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { PoolPlayer } from './poolplayer';
import {PoolPlayerService} from './poolplayer.service';
import { HttpErrorResponse } from '@angular/common/http';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent implements OnInit {
  public poolplayers: PoolPlayer[] = [];

  constructor(private poolplayerService: PoolPlayerService){}

  ngOnInit(){ 
    this.getPoolPlayers();
  }

  public getPoolPlayers(): void {
    this.poolplayerService.getPoolPlayer().subscribe(
      (response: PoolPlayer[]) => {
        this.poolplayers = response;
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    );
  }
}
