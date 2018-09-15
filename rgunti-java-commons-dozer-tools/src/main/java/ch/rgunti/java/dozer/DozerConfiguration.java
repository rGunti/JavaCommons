package ch.rgunti.java.dozer;

import ch.rgunti.java.dozer.converter.LocalDateConverter;
import ch.rgunti.java.dozer.converter.LocalDateTimeConverter;
import org.dozer.CustomFieldMapper;
import org.dozer.DozerBeanMapper;

import java.util.Arrays;

public class DozerConfiguration {

    public DozerMapper dozerBean(CustomFieldMapper customFieldMapper) {
        DozerBeanMapper dozerBean = new DozerBeanMapper(Arrays.asList("dozer-config.xml"));
        dozerBean.setCustomConverters(Arrays.asList(
                new LocalDateConverter(),
                new LocalDateTimeConverter()
        ));
        dozerBean.setCustomFieldMapper(customFieldMapper);

        return new DozerMapper(dozerBean);
    }

}
