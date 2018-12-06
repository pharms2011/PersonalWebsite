import { TestBed, inject } from '@angular/core/testing';

import { SkillServiceService } from './skill-service.service';

describe('SkillServiceService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [SkillServiceService]
    });
  });

  it('should be created', inject([SkillServiceService], (service: SkillServiceService) => {
    expect(service).toBeTruthy();
  }));
});
