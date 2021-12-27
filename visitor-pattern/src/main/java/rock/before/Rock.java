package rock.before;


import rock.Outcome;

import static rock.Outcome.*;

/**
 * @Author: An
 * @Date: 2021/12/24 14:09
 */
public class Rock implements Item {

    public Outcome eval(Paper p) {
        return WIN;
    }

    public Outcome eval(Scissors s) {
        return LOSE;
    }

    public Outcome eval(Rock r) {
        return DRAW;
    }

    @Override
    public Outcome eval(Item it) {
        return null;
    }

    public String toString() {
        return "Rock";
    }
}
