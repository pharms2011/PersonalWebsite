import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';  

import {PerBlogEntry} from '../entities/PerBlogEntry';
import {PerBlogPic} from '../entities/PerBlogPic';
import { Observable } from '../../../node_modules/rxjs';

const httpOptions = {
  headers: new HttpHeaders({
          'Content-Type':  'application/json',
      })
  };

@Injectable({
  providedIn: 'root'
})
export class PerBlogService {

  url: string = "http://ec2-18-204-219-176.compute-1.amazonaws.com:8080/PersonalWebsite/perBlog/";

  constructor(private http: HttpClient) { };
  getAllEntries(): Observable<PerBlogEntry[]>{
    return this.http.get<PerBlogEntry[]>(this.url + "published", httpOptions);
  }
  getEntryById(entryId : number){
    return this.http.get(this.url + "get/" +entryId, httpOptions);
  }
}
