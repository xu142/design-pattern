package currency;

/**
 * @Author: An
 * @Date: 2021/12/22 17:21
 */
public interface Iterator {
    //遍历到下一个元素
    public Object next();
    //是否已经遍历到尾部
    public boolean hasNext();
    //删除当前指向的元素
    public boolean remove();
}
