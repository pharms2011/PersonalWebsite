import { Injectable } from '@angular/core';

import { HttpClient, HttpHeaders } from '@angular/common/http';  

import {Skill} from '../entities/Skill';
import { Observable } from '../../../node_modules/rxjs';

const httpOptions = {
  headers: new HttpHeaders({
          'Content-Type':  'application/json',
      })
  };

@Injectable({
  providedIn: 'root'
})
export class SkillService {
  url: string = "http://ec2-18-204-219-176.compute-1.amazonaws.com:8080/PersonalWebsite/skills/";
  constructor(private http: HttpClient) { };
  getAllSkills(): Observable<Skill[]>{
    return this.http.get<Skill[]>(this.url + "all", httpOptions);
  }
  getSkillById(skillId : number){
    return this.http.get(this.url + "get/" +skillId, httpOptions);
  }
  createNewSkill(skill : Skill){
    let newSkill : Skill = new Skill();   
    return this.http.post(this.url + "save", newSkill, httpOptions);
  }
}
