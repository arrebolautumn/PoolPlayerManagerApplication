package com.chloefavkaomoji.kaomojimanager.services;

import com.chloefavkaomoji.kaomojimanager.model.PoolPlayer;
import com.chloefavkaomoji.kaomojimanager.exception.UserNotFoundException;
import com.chloefavkaomoji.kaomojimanager.repo.PoolPlayerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


import java.util.UUID;


@Service
public class PoolPlayerService {
    private final PoolPlayerRepo poolPlayerRepo;

    @Autowired
    public PoolPlayerService(PoolPlayerRepo repo){
        this.poolPlayerRepo = repo;
    }

    public PoolPlayer addPoolPlayer (PoolPlayer poolPlayer){
        poolPlayer.setPoolPlayerCode(UUID.randomUUID().toString());
        return poolPlayerRepo.save(poolPlayer);
    }

    public List<PoolPlayer> findAllPoolPlayers(){
        return poolPlayerRepo.findAll();
    }
    public PoolPlayer updatePoolPlayer(PoolPlayer poolPlayer){
        return poolPlayerRepo.save(poolPlayer);
    }
    public void deletePoolPlayerById(Long id){
        poolPlayerRepo.deletePoolPlayerById(id);
    }
    public PoolPlayer findPoolPlayerById(Long ID) throws UserNotFoundException{
        return poolPlayerRepo.findPoolPlayerById(ID).orElseThrow(() -> new UserNotFoundException("User ID " + ID + " is not found"));
    }
}
