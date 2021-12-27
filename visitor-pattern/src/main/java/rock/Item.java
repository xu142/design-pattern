package rock;

/**
 * @Author: An
 * @Date: 2021/12/24 14:07
 */
public interface Item {
    Outcome compete(Item it);

    Outcome eval(Paper p);

    Outcome eval(Scissors s);

    Outcome eval(Rock r);
}
