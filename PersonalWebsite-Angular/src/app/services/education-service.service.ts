import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';  

import {Education} from '../entities/Education';
import { Observable } from '../../../node_modules/rxjs';

const httpOptions = {
  headers: new HttpHeaders({
          'Content-Type':  'application/json',
      })
  };

@Injectable({
  providedIn: 'root'
})
export class EducationService{

  url: string = "http://ec2-18-204-219-176.compute-1.amazonaws.com:8080/PersonalWebsite/education/";
  
  constructor(private http: HttpClient) { };
  getAllEducation(): Observable<Education[]>{
    return this.http.get<Education[]>(this.url + "all", httpOptions);
  }
  getEducationById(educationId : number){
    return this.http.get(this.url + "get/" +educationId, httpOptions);
  }
  createNewEducation(education : Education){
    let newEducation : Education = new Education();   
    return this.http.post(this.url + "save", newEducation, httpOptions);
  }
}
