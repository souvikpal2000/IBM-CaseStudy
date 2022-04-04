import { TestBed } from '@angular/core/testing';

import { AddBookServiceService } from './add-book-service.service';

describe('AddBookServiceService', () => {
  let service: AddBookServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AddBookServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
