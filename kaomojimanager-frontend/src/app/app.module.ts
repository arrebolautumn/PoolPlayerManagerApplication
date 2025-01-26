import { BrowserModule } from "@angular/platform-browser";
import { NgModule } from "@angular/core";
import { CommonModule } from '@angular/common';
import { PoolPlayerService } from "./poolplayer.service";
import { HttpClientModule, provideHttpClient } from '@angular/common/http';

@NgModule({
    imports: [
        BrowserModule,
        HttpClientModule,
        CommonModule // Ensure CommonModule is imported
    ],
    providers: [
        PoolPlayerService,
        provideHttpClient()  
    ]
})
export class AppModule { }