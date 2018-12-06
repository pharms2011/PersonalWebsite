import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PerBlogComponent } from './per-blog.component';

describe('PerBlogComponent', () => {
  let component: PerBlogComponent;
  let fixture: ComponentFixture<PerBlogComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PerBlogComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PerBlogComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
