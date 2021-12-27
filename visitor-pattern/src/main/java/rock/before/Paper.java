package rock.before;



import rock.Outcome;

import static rock.Outcome.*;

/**
 * @Author: An
 * @Date: 2021/12/24 14:08
 */
public class Paper implements Item {
    public Outcome eval(Paper p) {
        return DRAW;
    }

    public Outcome eval(Scissors s) {
        return WIN;
    }

    public Outcome eval(Rock r) {
        return LOSE;
    }

    @Override
    public Outcome eval(Item it) {
        return null;
    }

    public String toString() {
        return "Paper";
    }
}
