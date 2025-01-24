import { TestBed } from '@angular/core/testing';

import { KaomojiService } from './kaomoji.service';

describe('KaomojiService', () => {
  let service: KaomojiService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(KaomojiService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
