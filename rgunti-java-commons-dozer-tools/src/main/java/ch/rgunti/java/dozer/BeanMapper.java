package ch.rgunti.java.dozer;

import java.util.List;

public interface BeanMapper {
    <S, T> T map(S var1, Class<T> var2);
    <S, T> List<T> map(List<S> var1, Class<T> var2);
}
