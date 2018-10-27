import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CatetoriaComponent } from './catetoria.component';

describe('CatetoriaComponent', () => {
  let component: CatetoriaComponent;
  let fixture: ComponentFixture<CatetoriaComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CatetoriaComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CatetoriaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
