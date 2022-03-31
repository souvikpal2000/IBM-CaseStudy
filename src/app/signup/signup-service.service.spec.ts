import { TestBed } from '@angular/core/testing';

import { SignupServiceService } from './signup-service.service';

describe('SignupServiceService', () => {
  let service: SignupServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(SignupServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
