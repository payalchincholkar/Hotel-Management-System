import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DeaprtmentServiceComponent } from './deaprtment-service.component';

describe('DeaprtmentServiceComponent', () => {
  let component: DeaprtmentServiceComponent;
  let fixture: ComponentFixture<DeaprtmentServiceComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DeaprtmentServiceComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DeaprtmentServiceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
