import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListaProjetoComponent } from './lista-projeto.component';

describe('ListaProjetoComponent', () => {
  let component: ListaProjetoComponent;
  let fixture: ComponentFixture<ListaProjetoComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ListaProjetoComponent]
    });
    fixture = TestBed.createComponent(ListaProjetoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
