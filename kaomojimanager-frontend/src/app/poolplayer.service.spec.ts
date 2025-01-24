import { TestBed } from '@angular/core/testing';

import { PoolPlayerService } from './poolplayer.service';

describe('PoolPlayerService', () => {
  let service: PoolPlayerService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(PoolPlayerService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
