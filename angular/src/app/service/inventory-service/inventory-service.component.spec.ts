import { ComponentFixture, TestBed } from '@angular/core/testing';

import { InventoryServiceComponent } from './inventory-service.component';

describe('InventoryServiceComponent', () => {
  let component: InventoryServiceComponent;
  let fixture: ComponentFixture<InventoryServiceComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ InventoryServiceComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(InventoryServiceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
