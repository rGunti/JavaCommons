package ch.rgunti.java.dozer.converter;

import org.dozer.DozerConverter;

import java.time.LocalDateTime;

public class LocalDateTimeConverter extends DozerConverter<LocalDateTime, LocalDateTime> {
    public LocalDateTimeConverter() {
        super(LocalDateTime.class, LocalDateTime.class);
    }

    @Override
    public LocalDateTime convertTo(LocalDateTime source, LocalDateTime destination) {
        return source;
    }

    @Override
    public LocalDateTime convertFrom(LocalDateTime source, LocalDateTime destination) {
        return this.convertTo(source, destination);
    }
}
