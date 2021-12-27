package after;

/**
 * @Author: An
 * @Date: 2021/12/22 16:49
 */
public interface IProjectIterator extends Iterable{
    public boolean hasNext();

    public IProject next();
}
