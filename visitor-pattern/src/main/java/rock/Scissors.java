package rock;

import static rock.Outcome.*;

/**
 * @Author: An
 * @Date: 2021/12/24 14:09
 */
public class Scissors implements Item{
    public Outcome compete(Item it) {
        return it.eval(this);
    }

    public Outcome eval(Paper p) {
        return LOSE;
    }

    public Outcome eval(Scissors s) {
        return DRAW;
    }

    public Outcome eval(Rock r) {
        return WIN;
    }

    public String toString() {
        return "Scissors";
    }
}
