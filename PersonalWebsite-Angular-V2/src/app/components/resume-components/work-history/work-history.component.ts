import { Component, OnInit } from '@angular/core';

import { WorkHistory } from '../../../entities/WorkHistory';
import { WorkHistoryService } from '../../../services/work-history.service'; 

@Component({
  selector: 'app-work-history',
  templateUrl: './work-history.component.html',
  styleUrls: ['./work-history.component.css']
})
export class WorkHistoryComponent implements OnInit {

  workHistorys: WorkHistory[];
  selectedHistory: String;

  constructor(private workHistoryService : WorkHistoryService) { 
    this.getWorkHistory();
  }

  ngOnInit() {
    this.selectedHistory = 'Click on an entry to learn more!';
  }

  getWorkHistory():void {
    this.workHistoryService.getAllWorkHistory()
    .subscribe(workHistory => 
      this.workHistorys = workHistory);
  }

  select(description : String){
    this.selectedHistory = description;
  }

}
