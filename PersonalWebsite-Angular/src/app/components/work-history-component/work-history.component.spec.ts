import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { WorkHistoryComponent } from './work-history.component';

describe('WorkHistoryComponentComponent', () => {
  let component: WorkHistoryComponent;
  let fixture: ComponentFixture<WorkHistoryComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ WorkHistoryComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(WorkHistoryComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
