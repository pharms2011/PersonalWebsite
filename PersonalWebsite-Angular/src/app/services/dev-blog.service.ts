import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';  

import {DevBlogEntry} from '../entities/DevBlogEntry';
import {DevBlogLink} from '../entities/DevBlogLink';
import { Observable } from '../../../node_modules/rxjs';

const httpOptions = {
  headers: new HttpHeaders({
          'Content-Type':  'application/json',
      })
  };

@Injectable({
  providedIn: 'root'
})
export class DevBlogService {

  url: string = "http://ec2-18-204-219-176.compute-1.amazonaws.com:8080/PersonalWebsite/devBlog/";

  constructor(private http: HttpClient) { };
  getAllEntries(): Observable<DevBlogEntry[]>{
    return this.http.get<DevBlogEntry[]>(this.url + "published", httpOptions);
  }
  getEntryById(educationId : number){
    return this.http.get(this.url + "get/" +educationId, httpOptions);
  }
}
