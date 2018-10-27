import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PaqueteTuristicoComponent } from './paquete-turistico.component';

describe('PaqueteTuristicoComponent', () => {
  let component: PaqueteTuristicoComponent;
  let fixture: ComponentFixture<PaqueteTuristicoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PaqueteTuristicoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PaqueteTuristicoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
