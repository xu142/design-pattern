/**
 * @Author: An
 * @Date: 2021/11/15 14:56
 */
public interface B<T, E, K> extends A{

    K testB(T t);

    @Override
    default void testA(Object o) {
        A.super.testA(o);
    }
}
