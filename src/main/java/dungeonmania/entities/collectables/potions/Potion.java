package dungeonmania.entities.collectables.potions;

import dungeonmania.Game;
import dungeonmania.battles.BattleStatistics;
import dungeonmania.entities.collectables.CollectableEntity;
import dungeonmania.util.Position;

public abstract class Potion extends CollectableEntity {
    private int duration;

    public Potion(Position position, int duration) {
        super(position);
        this.duration = duration;
    }

    public void use(Game game) {
        return;
    }

    public int getDuration() {
        return duration;
    }

    public BattleStatistics applyBuff(BattleStatistics origin) {
        return origin;
    }

    public int getDurability() {
        return 1;
    }
}
