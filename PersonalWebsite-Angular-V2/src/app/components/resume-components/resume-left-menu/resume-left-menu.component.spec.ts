import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ResumeLeftMenuComponent } from './resume-left-menu.component';

describe('ResumeLeftMenuComponent', () => {
  let component: ResumeLeftMenuComponent;
  let fixture: ComponentFixture<ResumeLeftMenuComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ResumeLeftMenuComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ResumeLeftMenuComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
