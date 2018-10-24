import { TestBed, inject } from '@angular/core/testing';

import { PerBlogService } from './per-blog.service';

describe('PerBlogService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [PerBlogService]
    });
  });

  it('should be created', inject([PerBlogService], (service: PerBlogService) => {
    expect(service).toBeTruthy();
  }));
});
