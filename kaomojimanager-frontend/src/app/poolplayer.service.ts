import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import {PoolPlayer} from "./poolplayer";
import { environment } from '../environments/environment';

@Injectable({
  providedIn: 'root'
})
export class PoolPlayerService {
  private apiServerUrl = environment.apiBaseUrl;

  constructor(private http: HttpClient) { }

  public getPoolPlayer(): Observable<PoolPlayer[]> {
    return this.http.get<PoolPlayer[]>(`${this.apiServerUrl}/poolplayer/all`);
  }
  
  public addPoolPlayer(poolplayer: PoolPlayer): Observable<PoolPlayer> {
    return this.http.post<PoolPlayer>(`${this.apiServerUrl}/poolplayer/add`, poolplayer);
  }

  public updatePoolPlayer(poolplayer: PoolPlayer): Observable<PoolPlayer> {
    return this.http.put<PoolPlayer>(`${this.apiServerUrl}/poolplayer/update`, poolplayer);
  }

  public deletePoolPlayer(poolplayerId: number): Observable<void> {
    return this.http.delete<void>(`${this.apiServerUrl}/poolplayer/delete/${ poolplayerId}`);
  }
}
