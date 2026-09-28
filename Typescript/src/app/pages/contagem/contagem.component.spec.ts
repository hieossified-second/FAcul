import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ContagemComponent } from './contagem.component';

describe('ContagemComponent', () => {
  let component: ContagemComponent;
  let fixture: ComponentFixture<ContagemComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ContagemComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ContagemComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
