import { TestBed } from '@angular/core/testing';

import { AuthenticatesGuard } from './authenticates.guard';

describe('AuthenticatesGuard', () => {
  let guard: AuthenticatesGuard;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    guard = TestBed.inject(AuthenticatesGuard);
  });

  it('should be created', () => {
    expect(guard).toBeTruthy();
  });
});
