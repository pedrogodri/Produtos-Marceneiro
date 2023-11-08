import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CadastroSubprojetoComponent } from './cadastro-subprojeto.component';

describe('CadastroSubprojetoComponent', () => {
  let component: CadastroSubprojetoComponent;
  let fixture: ComponentFixture<CadastroSubprojetoComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [CadastroSubprojetoComponent]
    });
    fixture = TestBed.createComponent(CadastroSubprojetoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
