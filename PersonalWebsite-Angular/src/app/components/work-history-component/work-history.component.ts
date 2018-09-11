import { Component, OnInit } from '@angular/core';

import { WorkHistory } from '../../entities/WorkHistory';
import { WorkHistoryService } from '../../services/work-history.service'; 

@Component({
  selector: 'app-work-history-component',
  templateUrl: './work-history.component.html',
  styleUrls: ['./work-history.component.css']
})
export class WorkHistoryComponent implements OnInit {
  workHistorys: WorkHistory[];
  constructor(private workHistoryService : WorkHistoryService) { 
    this.getWorkHistory();
  }

  ngOnInit() {
    
  }

  getWorkHistory():void {
    this.workHistoryService.getAllWorkHistory()
    .subscribe(workHistory => 
      this.workHistorys = workHistory);
      console.log("this.workHistorys");
  }
}
