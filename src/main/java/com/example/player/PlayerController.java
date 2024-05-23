package com.example.player;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.*;
import com.example.player.PlayerService;

@RestController
class PlayerController {
    PlayerService service = new PlayerService();

    @GetMapping("/players")
    public ArrayList<Player> getPlayer() {
        return service.getPlayer();
    }

    @GetMapping("/players/{playersId}")

    public Player getPlayersIds(@PathVariable("playersId") int playerId) {
        return service.getPlayersIds(playerId);
    }

    @PostMapping("/players")
    public Player addPlayer(@RequestBody Player play) {
        return service.addPlayer(play);
    }

    @PutMapping("/players/{playersId}")
    public Player updatePlayer(@PathVariable("playersId") int playerId,@RequestBody Player play) {
        return service.updatePlayer(playerId, play);
    }

    @DeleteMapping("/players/{playersId}")
    public void deletePlayer(@PathVariable("playersId") int playerId) {
        service.deletePlayer(playerId);                                    
    }
}
