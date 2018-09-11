import { TestBed, inject } from '@angular/core/testing';

import { EducationServiceService } from './education-service.service';

describe('EducationServiceService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [EducationServiceService]
    });
  });

  it('should be created', inject([EducationServiceService], (service: EducationServiceService) => {
    expect(service).toBeTruthy();
  }));
});
