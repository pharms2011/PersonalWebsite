import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';

import { HttpModule} from '@angular/http';
import { EducationService } from './services/education-service.service';
import { DevBlogService } from './services/dev-blog.service';
import { SkillService } from './services/skill-service.service';
import { WorkHistoryService } from './services/work-history.service';
import { HttpClient, HttpHandler } from '../../node_modules/@angular/common/http';
import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';

import { SocialMediaBarComponent } from './components/social-media-bar-component/social-media-bar/social-media-bar.component';
import { ResumePageComponent } from './../app/pages/resume-page/resume-page.component';
import { ResumeLeftMenuComponent} from './components/resume-components/resume-left-menu/resume-left-menu.component';
import { WorkHistoryComponent } from './components/resume-components/work-history/work-history.component';
import { EducationComponent } from './components/resume-components/education/education.component';
import { SkillsComponent } from './components/resume-components/skills/skills.component';
import { DevBlogPageComponent } from './pages/dev-blog-page/dev-blog-page.component';
import { PersonalBlogPageComponent } from './pages/personal-blog-page/personal-blog-page.component';

@NgModule({
  declarations: [
    AppComponent,
    SocialMediaBarComponent,
    ResumePageComponent,
    DevBlogPageComponent,
    PersonalBlogPageComponent,
    ResumeLeftMenuComponent,
    WorkHistoryComponent,
    EducationComponent,
    SkillsComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    HttpModule,
    NgbModule.forRoot()
  ],
  providers: [HttpClient,
    EducationService,
    DevBlogService,
    SkillService,
    WorkHistoryService],
  bootstrap: [AppComponent]
})
export class AppModule { }
