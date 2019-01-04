import { Component, OnInit } from '@angular/core';

import { Skill } from '../../../entities/Skill' 
import { SkillService } from '../../../services/skill-service.service';

@Component({
  selector: 'app-skills',
  templateUrl: './skills.component.html',
  styleUrls: ['./skills.component.css']
})
export class SkillsComponent implements OnInit {

  skills : Skill[];

  constructor(private skillService : SkillService) {
    this.getSkills();
   }

  ngOnInit() {
    document.getElementById("defaultOpen").click();
  }

  getSkills():void {
    this.skillService.getAllSkills()
    .subscribe(skill => 
      this.skills = skill);
  }

  openCity(evt, cityName) {
    var i, tabcontent, tablinks;
    tabcontent = document.getElementsByClassName("tabcontent");
    for (i = 0; i < tabcontent.length; i++) {
      tabcontent[i].style.display = "none";
    }
    tablinks = document.getElementsByClassName("tablinks");
    for (i = 0; i < tablinks.length; i++) {
      tablinks[i].className = tablinks[i].className.replace(" active", "");
    }
    document.getElementById(cityName).style.display = "block";
    evt.currentTarget.className += " active";
  }
}
