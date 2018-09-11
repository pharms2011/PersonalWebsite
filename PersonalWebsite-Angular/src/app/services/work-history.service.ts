import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';  

import {WorkHistory} from '../entities/WorkHistory';
import { Observable } from 'rxjs';

const httpOptions = {
  headers: new HttpHeaders({
          'Content-Type':  'application/json',
      })
  };

@Injectable({
  providedIn: 'root'
})
export class WorkHistoryService {
  
  url: string = "http://ec2-18-204-219-176.compute-1.amazonaws.com:8080/PersonalWebsite/workHistory/";
  constructor(private http: HttpClient) { };
  getAllWorkHistory(): Observable<WorkHistory[]>{
    return this.http.get<WorkHistory[]>(this.url + "all", httpOptions);
  }
  getWorkHistoryById(workHistoryId : number){
    return this.http.get(this.url + "get/" +workHistoryId, httpOptions);
  }
  createNewWorkHistory(workHistory : WorkHistory){
    let newWorkHistory : WorkHistory = new WorkHistory();   
    return this.http.post(this.url + "save", newWorkHistory, httpOptions);
  }
}
