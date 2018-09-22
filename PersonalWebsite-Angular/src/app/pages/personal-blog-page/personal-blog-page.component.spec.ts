import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PersonalBlogPageComponent } from './personal-blog-page.component';

describe('PersonalBlogPageComponent', () => {
  let component: PersonalBlogPageComponent;
  let fixture: ComponentFixture<PersonalBlogPageComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PersonalBlogPageComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PersonalBlogPageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
