package com.chloefavkaomoji.kaomojimanager;

import com.chloefavkaomoji.kaomojimanager.services.PoolPlayerService;
import com.chloefavkaomoji.kaomojimanager.model.PoolPlayer;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/poolplayer")
public class PoolPlayerResource {
    private final PoolPlayerService poolPlayerService;
    public PoolPlayerResource(PoolPlayerService poolPlayerService ){
        this.poolPlayerService=poolPlayerService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<PoolPlayer>> getAllPoolPlayers (){
        List<PoolPlayer> poolPlayers = poolPlayerService.findAllPoolPlayers();
        return new ResponseEntity<>(poolPlayers, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<PoolPlayer> getPoolPlayerById(@PathVariable("id") Long id){
        PoolPlayer poolPlayer = poolPlayerService.findPoolPlayerById(id);
        return new ResponseEntity<>(poolPlayer, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<PoolPlayer> addPoolPlayer(@RequestBody PoolPlayer poolPlayer){
        PoolPlayer newPoolPlayer = poolPlayerService.addPoolPlayer(poolPlayer);
        return new ResponseEntity<>(newPoolPlayer, HttpStatus.CREATED);
    }
    @PutMapping("/update")
    public ResponseEntity<PoolPlayer> updatePoolPlayer(@RequestBody PoolPlayer poolPlayer){
        PoolPlayer updatePoolPlayer = poolPlayerService.updatePoolPlayer(poolPlayer);
        return new ResponseEntity<>(updatePoolPlayer, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deletePoolPlayer(@PathVariable("id") Long id){
        poolPlayerService.deletePoolPlayerById(id);
        return new ResponseEntity<>( HttpStatus.OK);
    }



}
