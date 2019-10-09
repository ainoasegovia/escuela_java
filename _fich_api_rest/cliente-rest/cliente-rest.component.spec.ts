import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ClienteRestComponent } from './cliente-rest.component';

describe('ClienteRestComponent', () => {
  let component: ClienteRestComponent;
  let fixture: ComponentFixture<ClienteRestComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ClienteRestComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ClienteRestComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
