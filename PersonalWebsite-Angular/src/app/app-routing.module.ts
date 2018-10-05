import { NgModule }             from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
 
import { ResumePageComponent } from './pages/resume-page/resume-page.component';
import { PersonalBlogPageComponent } from './pages/personal-blog-page/personal-blog-page.component';
import { DevBlogPageComponent } from './pages/dev-blog-page/dev-blog-page.component'
 
const routes: Routes = [
  { path: '', redirectTo: '/resume', pathMatch: 'full' },
  { path: 'resume', component: ResumePageComponent },
  { path: 'personalBlog', component: PersonalBlogPageComponent },
  { path: 'devBlog', component: DevBlogPageComponent }
];
 
@NgModule({
  imports: [ RouterModule.forRoot(routes) ],
  exports: [ RouterModule ]
})
export class AppRoutingModule {}
