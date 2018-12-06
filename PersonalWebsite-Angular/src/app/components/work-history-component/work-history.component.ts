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
  switchConst: String;
  constructor(private workHistoryService : WorkHistoryService) { 
    this.getWorkHistory();
    this.switchConst = "Left";
  }

  ngOnInit() {
  }

  getWorkHistory():void {
    this.workHistoryService.getAllWorkHistory()
    .subscribe(workHistory => 
      this.workHistorys = workHistory);
  }

  switch(i : number):boolean{ 
    if(i%2){
      return true;
    }
    else{
      return false;
    }
  }
}
