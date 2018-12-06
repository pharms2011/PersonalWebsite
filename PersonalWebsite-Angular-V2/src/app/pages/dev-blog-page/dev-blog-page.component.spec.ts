import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DevBlogPageComponent } from './dev-blog-page.component';

describe('DevBlogPageComponent', () => {
  let component: DevBlogPageComponent;
  let fixture: ComponentFixture<DevBlogPageComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DevBlogPageComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DevBlogPageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
