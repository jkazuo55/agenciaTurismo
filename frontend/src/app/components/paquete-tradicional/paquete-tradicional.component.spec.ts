import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PaqueteTradicionalComponent } from './paquete-tradicional.component';

describe('PaqueteTradicionalComponent', () => {
  let component: PaqueteTradicionalComponent;
  let fixture: ComponentFixture<PaqueteTradicionalComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PaqueteTradicionalComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PaqueteTradicionalComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
