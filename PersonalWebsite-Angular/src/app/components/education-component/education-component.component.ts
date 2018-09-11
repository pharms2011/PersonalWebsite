import { Component, OnInit, ViewChild } from '@angular/core';

import { Education } from '../../entities/Education' 
import { EducationService } from '../../services/education-service.service';

import { MatTableDataSource, MatSort } from '@angular/material';
import { DataSource } from '@angular/cdk/table';
import {animate, state, style, transition, trigger} from '@angular/animations';

@Component({
  selector: 'app-education-component',
  templateUrl: './education-component.component.html',
  styleUrls: ['./education-component.component.css'],
  animations: [
    trigger('detailExpand', [
      state('collapsed', style({height: '0px', minHeight: '0', display: 'none'})),
      state('expanded', style({height: '*'})),
      transition('expanded <=> collapsed', animate('225ms cubic-bezier(0.4, 0.0, 0.2, 1)')),
    ]),
  ],
})
export class EducationComponent implements OnInit {
  
  columnsToDisplay = ['School', 'Major', 'Start/End Month'];
  expandedElement: Education;
  @ViewChild(MatSort) sort: MatSort;
  education : Education[];
  constructor(
    private educationService : EducationService
  ) {
    this.getEducation();
  }

  ngOnInit() {
    var dataSource = this.education;
  }
  getEducation():void {
    this.educationService.getAllEducation()
    .subscribe(education => 
      this.education = education);
  }
}

