package S181860072;

import java.util.ArrayList;
import java.util.List;

import S181860072.Line.Position;;

public class Monster implements Linable{
    private final int r;
    private final int g;
    private final int b;
    private final int rank;

    private static List<Monster> monsters=new ArrayList<Monster>();
    private static int rankCount = 0;

    private Position position;

    Monster(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
        this.rank = Monster.rankCount;
        Monster.monsters.add(this);
        Monster.rankCount++;
    }

    public static Monster getMonsterByRank(int r) {

        for (Monster monster : Monster.monsters) {
            if (monster.rank() == r) {
                return monster;
            }
        }
        return null;

    }

    public int rank() {
        return this.rank;
    }

    @Override
    public String toString() {
        String rank=Integer.toString(this.rank());
        if(rank.length()==1)
            rank="00"+rank;
        else if(rank.length()==2)
            rank="0"+rank;
        return "\033[48;2;" + this.r + ";" + this.g + ";" + this.b + ";38;2;0;0;0m    " + rank + "  \033[0m";
    }

    @Override
    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public Position getPosition() {
        return this.position;
    }

    public void swapPosition(Monster another) {
        Position p = another.position;
        this.position.setLinable(another);
        p.setLinable(this);
    }

    @Override
    public int getValue() {
        return this.rank();
    }
}
