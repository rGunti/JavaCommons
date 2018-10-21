package ch.rgunti.java.dozer;

import org.dozer.CustomFieldMapper;
import org.dozer.classmap.ClassMap;
import org.dozer.fieldmap.FieldMap;
import org.hibernate.Hibernate;
import org.hibernate.collection.internal.PersistentSet;

public class DozerBeanMapper implements CustomFieldMapper {
    @Override
    public boolean mapField(Object source, Object destination, Object sourceFieldValue,
                            ClassMap classMap, FieldMap fieldMap) {
        // Lazy initializer: initialized yet?
        if (!Hibernate.isInitialized(sourceFieldValue)) return true;

        // Hibernate collection proxy?
        if (!(sourceFieldValue instanceof PersistentSet)) return false;
        if (((PersistentSet) sourceFieldValue).wasInitialized()) return false;

        return true;
    }
}
