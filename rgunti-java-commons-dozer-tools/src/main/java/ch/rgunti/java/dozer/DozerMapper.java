package ch.rgunti.java.dozer;

import org.dozer.Mapper;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DozerMapper implements BeanMapper {
    private Mapper mapper;

    public DozerMapper(Mapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public <S, T> T map(S entity, Class<T> clazz) {
        return entity == null ? null : this.mapper.map(entity, clazz);
    }

    @SuppressWarnings("unchecked")
    @Override
    public <S, T> List<T> map(List<S> entities, Class<T> clazz) {
        if( entities != null && !entities.isEmpty()) {
            ArrayList result = new ArrayList(entities.size());
            Iterator var4 = entities.iterator();

            while (var4.hasNext()) {
                Object entity = var4.next();
                result.add(this.mapper.map(entity, clazz));
            }

            return result;
        } else {
            return new ArrayList(0);
        }
    }
}
