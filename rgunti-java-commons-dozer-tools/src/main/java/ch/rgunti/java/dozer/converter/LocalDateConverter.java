package ch.rgunti.java.dozer.converter;

import org.dozer.DozerConverter;

import java.time.LocalDate;

public class LocalDateConverter extends DozerConverter<LocalDate, LocalDate> {
    public LocalDateConverter() {
        super(LocalDate.class, LocalDate.class);
    }

    @Override
    public LocalDate convertTo(LocalDate source, LocalDate destination) {
        return source;
    }

    @Override
    public LocalDate convertFrom(LocalDate source, LocalDate destination) {
        return this.convertTo(source, destination);
    }
}
