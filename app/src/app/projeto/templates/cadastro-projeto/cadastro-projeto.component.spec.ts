import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CadastroProjetoComponent } from './cadastro-projeto.component';

describe('CadastroProjetoComponent', () => {
  let component: CadastroProjetoComponent;
  let fixture: ComponentFixture<CadastroProjetoComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [CadastroProjetoComponent]
    });
    fixture = TestBed.createComponent(CadastroProjetoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
