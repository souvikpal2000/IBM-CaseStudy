import { TestBed } from '@angular/core/testing';

import { PlansServiceService } from './plans-service.service';

describe('PlansServiceService', () => {
  let service: PlansServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(PlansServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
