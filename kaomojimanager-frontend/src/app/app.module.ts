import { BrowserModule } from "@angular/platform-browser";
import { NgModule } from "@angular/core";
import { AppComponent } from "./app.component";
import { PoolPlayerService } from "./poolplayer.service";

@NgModule({
    declarations: [
        AppComponent
    ],
    imports: [
        BrowserModule
    ],
    providers: [PoolPlayerService],
    bootstrap: [AppComponent]
})

export class AppModule{

}