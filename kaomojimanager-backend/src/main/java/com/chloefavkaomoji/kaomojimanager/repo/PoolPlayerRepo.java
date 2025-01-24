package com.chloefavkaomoji.kaomojimanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.chloefavkaomoji.kaomojimanager.model.*;

import java.util.Optional;
import org.springframework.stereotype.Repository;

@Repository
public interface PoolPlayerRepo extends JpaRepository<PoolPlayer, Long> {

    public void deletePoolPlayerById(Long id);

    Optional<PoolPlayer> findPoolPlayerById(Long id);
}
