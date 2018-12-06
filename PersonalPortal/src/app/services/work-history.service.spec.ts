import { TestBed, inject } from '@angular/core/testing';

import { WorkHistoryService } from './work-history.service';

describe('WorkHistoryServiceService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [WorkHistoryService]
    });
  });

  it('should be created', inject([WorkHistoryService], (service: WorkHistoryService) => {
    expect(service).toBeTruthy();
  }));
});
