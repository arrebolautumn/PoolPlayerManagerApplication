import { BrowserModule } from "@angular/platform-browser";
import { NgModule } from "@angular/core";
import { CommonModule } from '@angular/common';
import { HttpClientModule, provideHttpClient } from '@angular/common/http';
import { RouterModule } from '@angular/router'; // Import RouterModule
import { AppComponent } from './app.component'; // Import AppComponent
import { HomeComponent } from './home/home.component'; // Import HomeComponent
import { AboutComponent } from './about/about.component'; // Import AboutComponent
import { PageNotFoundComponent } from './page-not-found/page-not-found.component'; // Import PageNotFoundComponent
import { routes } from './app.routes'; // Import routes

import { PoolPlayerService } from "./poolplayer.service";

@NgModule({
    declarations: [
        AppComponent,
        HomeComponent,
        AboutComponent,
        PageNotFoundComponent
    ],
    imports: [
        BrowserModule,
        HttpClientModule,
        CommonModule, // Ensure CommonModule is imported
        RouterModule.forRoot(routes) // Configure RouterModule with routes
    ],
    providers: [
        PoolPlayerService,
        provideHttpClient()  
    ],
    bootstrap: [AppComponent] // Bootstrap the AppComponent
})
export class AppModule { }