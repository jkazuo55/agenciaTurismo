import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { LugarTutisticoComponent } from './lugar-tutistico.component';

describe('LugarTutisticoComponent', () => {
  let component: LugarTutisticoComponent;
  let fixture: ComponentFixture<LugarTutisticoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ LugarTutisticoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LugarTutisticoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
