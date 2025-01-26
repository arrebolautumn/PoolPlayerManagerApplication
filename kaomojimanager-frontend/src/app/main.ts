import { bootstrapApplication } from '@angular/platform-browser';
import { AppComponent } from './app.component';
import { provideHttpClient } from '@angular/common/http';
import { PoolPlayerService } from './poolplayer.service';

bootstrapApplication(AppComponent, {
    providers: [
        provideHttpClient(),
        PoolPlayerService
    ]
}).catch(err => console.error(err));