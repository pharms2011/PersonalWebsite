import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { AppComponent } from './app.component';
import { EducationComponent } from './components/education-component/education-component.component';
import { WorkHistoryComponent } from './components/work-history-component/work-history.component';
import { ProjectComponent } from './components/project-component/project.component';
import { SkillComponent } from './components/skill-component/skill.component';

import { HttpModule} from '@angular/http';
import { EducationService } from './services/education-service.service';
import { HttpClient, HttpHandler } from '../../node_modules/@angular/common/http';
import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';

import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import { Component, OnInit, ViewChild } from '@angular/core';
import { MatExpansionModule,MatGridListModule, MatTooltipModule, MatDividerModule, MatTableDataSource, MatSort, MatCardModule, MatProgressSpinnerModule, MatMenuModule, MatIconModule, MatToolbarModule, MatButtonModule, MatFormFieldModule, MatInputModule, MatSelectModule, MatSortModule, MatTableModule, MatChipsModule} from '@angular/material';
import { DataSource } from '@angular/cdk/table';
import { HexagonsComponent } from './components/hexagons/hexagons.component';

import { MglTimelineModule } from 'angular-mgl-timeline';
import { AppRoutingModule } from './/app-routing.module';
import { ResumePageComponent } from './resume-page/resume-page.component';
import { DevBlogPageComponent } from './dev-blog-page/dev-blog-page.component';
import { PersonalBlogPageComponent } from './personal-blog-page/personal-blog-page.component';

@NgModule({
  declarations: [
    AppComponent,
    EducationComponent,
    WorkHistoryComponent,
    ProjectComponent,
    SkillComponent,
    HexagonsComponent,
    ResumePageComponent,
    DevBlogPageComponent,
    PersonalBlogPageComponent
  ],
  imports: [
    BrowserModule,
    HttpModule,
    HttpClientModule,
    BrowserAnimationsModule,
    MatCardModule,
    MatProgressSpinnerModule,
    MatMenuModule,
    MatIconModule,
    MatToolbarModule,
    MatButtonModule,
    MatFormFieldModule,
    MatInputModule,
    MatSelectModule,
    MatSortModule,
    MatTableModule,
    MatDividerModule,
    MatChipsModule,
    MatTooltipModule,
    MglTimelineModule,
    MatGridListModule,
    AppRoutingModule,
    MatExpansionModule
  ],
  providers: [
    EducationService,
    HttpClient
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
