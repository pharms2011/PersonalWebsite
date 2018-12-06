import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';  

import {Project} from '../entities/Project';
import { Observable } from '../../../node_modules/rxjs';

const httpOptions = {
  headers: new HttpHeaders({
          'Content-Type':  'application/json',
      })
  };

@Injectable({
  providedIn: 'root'
})
export class ProjectServiceService {
  
  url: string = "http://ec2-18-204-219-176.compute-1.amazonaws.com:8080/PersonalWebsite/projects/";
  constructor(private http: HttpClient) { };
  getAllProjects(): Observable<Project[]>{
    return this.http.get<Project[]>(this.url + "all", httpOptions);
  }
  getProjectById(projectId : number){
    return this.http.get(this.url + "get/" +projectId, httpOptions);
  }
  createNewEducation(project : Project){
    let newProject : Project = new Project();   
    return this.http.post(this.url + "save", newProject, httpOptions);
  }
}
