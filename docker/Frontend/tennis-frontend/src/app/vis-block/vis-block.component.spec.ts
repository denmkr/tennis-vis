import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { VisBlockComponent } from './vis-block.component';

describe('VisBlockComponent', () => {
  let component: VisBlockComponent;
  let fixture: ComponentFixture<VisBlockComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ VisBlockComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(VisBlockComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
