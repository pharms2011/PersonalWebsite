import {Component, OnInit} from '@angular/core';

import {DevBlogEntry} from '../../../entities/DevBlogEntry';
import {DevBlogService} from '../../../services/dev-blog.service'


@Component({
  selector: 'app-dev-blog',
  templateUrl: './dev-blog.component.html',
  styleUrls: ['./dev-blog.component.css']
})
export class DevBlogComponent implements OnInit {
  entries : DevBlogEntry[];
  constructor(
    private devBlogService : DevBlogService
  ) {
    this.getEntries();
  }

  ngOnInit() {
    var dataSource = this.entries;
  }
  getEntries():void {
    this.devBlogService.getAllEntries()
    .subscribe(education => 
      this.entries = education);
  }

}
