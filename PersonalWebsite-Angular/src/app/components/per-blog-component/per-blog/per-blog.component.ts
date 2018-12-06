import { Component, OnInit } from '@angular/core';

import {PerBlogEntry} from '../../../entities/PerBlogEntry';
import {PerBlogPic} from '../../../entities/PerBlogPic';
import {PerBlogService} from '../../../services/per-blog.service'

@Component({
  selector: 'app-per-blog',
  templateUrl: './per-blog.component.html',
  styleUrls: ['./per-blog.component.css']
})
export class PerBlogComponent implements OnInit {

  entries : PerBlogEntry[];
  constructor(
    private perBlogService : PerBlogService
  ) {
    this.getEntries();
  }

  ngOnInit() {
    var dataSource = this.entries;
  }

  getEntries():void {
    this.perBlogService.getAllEntries()
    .subscribe(education => 
      this.entries = education);
  }

  setCurrentPic(id : Number, pic : PerBlogPic){
    var i : any;
    i = 0;
    while(this.entries[i]){
      if(this.entries[i].perBlogEntryId == id){
        this.entries[i].selectedImg = pic;
      }
      i++;
    }
  }
}
