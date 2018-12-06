import { TestBed, inject } from '@angular/core/testing';

import { DevBlogService } from './dev-blog.service';

describe('DevBlogService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [DevBlogService]
    });
  });

  it('should be created', inject([DevBlogService], (service: DevBlogService) => {
    expect(service).toBeTruthy();
  }));
});
