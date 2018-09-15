package ch.rgunti.java.dozer.converter;

import org.dozer.DozerConverter;

import java.time.LocalDateTime;

public class StringToLocalDateTimeConverter extends DozerConverter<String, LocalDateTime> {
    private LocalDateTimeToStringConverter otherWayConverter;

    public StringToLocalDateTimeConverter() {
        super(String.class, LocalDateTime.class);
        otherWayConverter = new LocalDateTimeToStringConverter();
    }

    @Override
    public LocalDateTime convertTo(String source, LocalDateTime destination) {
        return otherWayConverter.convertFrom(source, destination);
    }

    @Override
    public String convertFrom(LocalDateTime source, String destination) {
        return otherWayConverter.convertTo(source, destination);
    }
}
