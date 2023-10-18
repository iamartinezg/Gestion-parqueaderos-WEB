import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListaCarrosComponent } from './lista-carros.component';

describe('ListaCarrosComponent', () => {
  let component: ListaCarrosComponent;
  let fixture: ComponentFixture<ListaCarrosComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ListaCarrosComponent]
    });
    fixture = TestBed.createComponent(ListaCarrosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
