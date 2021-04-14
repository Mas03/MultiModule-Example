package me.mason;

import org.bukkit.Location;
import org.bukkit.block.Block;

import java.util.HashSet;
import java.util.Set;

public class BetaApp implements Paste {

    @Override
    public void paste(Location location) {
        final Set<Block> blockSet = new HashSet<>();
        blockSet.forEach(it -> location.getBlock().setType(it.getType()));
    }
}
