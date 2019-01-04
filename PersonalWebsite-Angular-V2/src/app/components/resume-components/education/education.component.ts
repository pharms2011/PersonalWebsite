import { Component, OnInit } from '@angular/core';

import { Education } from '../../../entities/Education' 
import { EducationService } from '../../../services/education-service.service';

@Component({
  selector: 'app-education',
  templateUrl: './education.component.html',
  styleUrls: ['./education.component.css']
})
export class EducationComponent implements OnInit {

  educations : Education[];

  constructor(private educationService : EducationService) {
    
    this.getEducation();

   }

  ngOnInit() {
  }

  getEducation():void {
    this.educationService.getAllEducation()
    .subscribe(educations => 
      this.educations = educations);
  }

}
