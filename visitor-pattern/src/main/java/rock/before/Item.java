package rock.before;

import rock.Outcome;

/**
 * @Author: An
 * @Date: 2021/12/24 14:37
 */
public interface Item {
    Outcome eval(Paper p);

    Outcome eval(Scissors s);

    Outcome eval(Rock r);

    Outcome eval(Item it);
}
