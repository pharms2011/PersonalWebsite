import { Component, OnInit } from '@angular/core';

import { PerBlogService } from '../../../services/per-blog.service';
import { PerBlogEntry } from '../../../entities/PerBlogEntry';

@Component({
  selector: 'app-personal-blog',
  templateUrl: './personal-blog.component.html',
  styleUrls: ['./personal-blog.component.css']
})
export class PersonalBlogComponent implements OnInit {

  entries : PerBlogEntry[];
  currentEntry : PerBlogEntry;

  constructor(
    private perBlogService : PerBlogService
  ) { }

  ngOnInit() {
    this.currentEntry = new PerBlogEntry();
    this.getEducation();
  } 

  getEducation():void {
    this.perBlogService.getAllEntries()
    .subscribe(entries => 
      this.entries = entries);
  }

  selectEntry(entry : PerBlogEntry){
    console.log(entry.pictures[0]);
    this.currentEntry.perBlogEntry = entry.perBlogEntry;
    this.currentEntry.perBlogEntryId = entry.perBlogEntryId;
    this.currentEntry.pictures = entry.pictures;
    this.currentEntry.published = entry.published;
  }
}
