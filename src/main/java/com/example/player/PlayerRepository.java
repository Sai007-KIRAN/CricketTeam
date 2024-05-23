// Write your code here
package com.example.player;

import java.util.*;

public interface PlayerRepository {
    ArrayList<Player> getPlayer();

    Player getPlayersIds(int playerId);

    Player addPlayer(Player play);

    Player updatePlayer(int playerId, Player play);

    void deletePlayer(int playerId);
}