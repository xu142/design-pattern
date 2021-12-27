package rock;

import static rock.Outcome.*;

/**
 * @Author: An
 * @Date: 2021/12/24 14:09
 */
public class Rock implements Item{
    public Outcome compete(Item it) {
        return it.eval(this);
    }

    public Outcome eval(Paper p) {
        return WIN;
    }

    public Outcome eval(Scissors s) {
        return LOSE;
    }

    public Outcome eval(Rock r) {
        return DRAW;
    }

    public String toString() {
        return "Rock";
    }
}
