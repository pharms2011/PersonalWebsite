import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { HttpModule} from '@angular/http';
import { PerBlogService } from './services/per-blog.service';
import { HttpClient, HttpHandler } from '../../node_modules/@angular/common/http';
import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';

import { AppComponent } from './app.component';
import { PersonalBlogComponent } from './components/personalBlog/personal-blog/personal-blog.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { PersonalBlogPageComponent } from './pages/personalBlog/personal-blog-page/personal-blog-page.component';

@NgModule({
  declarations: [
    AppComponent,
    PersonalBlogComponent,
    PersonalBlogPageComponent
  ],
  imports: [
    BrowserModule,
    HttpModule,
    BrowserModule,
    HttpClientModule,
    NgbModule.forRoot()
  ],
  providers: [
    PerBlogService,
    HttpClient
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
