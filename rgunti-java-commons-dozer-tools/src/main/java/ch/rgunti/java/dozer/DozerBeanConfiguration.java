package ch.rgunti.java.dozer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DozerBeanConfiguration extends DozerConfiguration {

    @Bean("dozerMapper")
    public DozerMapper mapperBean() {
        return dozerBean(new DozerBeanMapper());
    }

}
