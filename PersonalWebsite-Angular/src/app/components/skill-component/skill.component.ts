import { Component, OnInit, ViewChild  } from '@angular/core';
import {FormControl} from '@angular/forms';

import { Skill } from '../../entities/Skill' 
import { SkillService } from '../../services/skill-service.service';

import { MatTableDataSource, MatSort, MatDivider } from '@angular/material';
import { DataSource } from '@angular/cdk/table';
import {animate, state, style, transition, trigger} from '@angular/animations';

@Component({
  selector: 'app-skill-component',
  templateUrl: './skill.component.html',
  styleUrls: ['./skill.component.css'],
  animations: [
    trigger('detailExpand', [
      state('collapsed', style({height: '0px', minHeight: '0', display: 'none'})),
      state('expanded', style({height: '*'})),
      transition('expanded <=> collapsed', animate('225ms cubic-bezier(0.4, 0.0, 0.2, 1)')),
    ]),
  ],
})
export class SkillComponent implements OnInit {
  showDelay = new FormControl(1000);
  hideDelay = new FormControl(2000);
  skills : Skill[];
  chipColor : String = "#7AE7C7";
  constructor(private skillService : SkillService) {
    this.getSkills();
   }

  ngOnInit() {
    var dataSource = this.skills;
  }
  getSkills():void {
    this.skillService.getAllSkills()
    .subscribe(skill => 
      this.skills = skill);
  }
}
