import { Component, OnInit } from '@angular/core';
import { PoolPlayer } from './poolplayer';
import { PoolPlayerService } from './poolplayer.service';
import { HttpErrorResponse } from '@angular/common/http';
import { CommonModule } from '@angular/common';
import { provideHttpClient } from '@angular/common/http';

@Component({
  selector: 'app-root',
  standalone: true, // Mark as standalone
  imports: [CommonModule], 
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  public poolplayers: PoolPlayer[] = [];

  constructor(private poolplayerService: PoolPlayerService) {}

  ngOnInit() { 
    this.getPoolPlayers();
  }

  public getPoolPlayers(): void {
    this.poolplayerService.getPoolPlayer().subscribe({
      next: (response: PoolPlayer[]) => {
        this.poolplayers = response;
      },
      error: (error: HttpErrorResponse) => {
        alert(error.message);
      }
    });
  }
  public onOpenModal(poolplayer : PoolPlayer, mode: string): void{
    const button = document.createElement('button');
    button.type = 'button';
    button.style.display = 'none';
    button.setAttribute('data-toggle', 'modal');
    if (mode == "add"){
      button.setAttribute('data-target','modal');
    }

  }

}