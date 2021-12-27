package rock;

import static rock.Outcome.*;

/**
 * @Author: An
 * @Date: 2021/12/24 14:08
 */
public class Paper implements Item{
    public Outcome compete(Item it) {
        return it.eval(this);
    }

    public Outcome eval(Paper p) {
        return DRAW;
    }

    public Outcome eval(Scissors s) {
        return WIN;
    }

    public Outcome eval(Rock r) {
        return LOSE;
    }

    public String toString() {
        return "Paper";
    }
}
