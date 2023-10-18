import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CarroDetallesComponent } from './carro-detalles.component';

describe('CarroDetallesComponent', () => {
  let component: CarroDetallesComponent;
  let fixture: ComponentFixture<CarroDetallesComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [CarroDetallesComponent]
    });
    fixture = TestBed.createComponent(CarroDetallesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
