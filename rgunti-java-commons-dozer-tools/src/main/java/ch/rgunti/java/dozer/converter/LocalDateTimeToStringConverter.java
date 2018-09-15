package ch.rgunti.java.dozer.converter;

import org.dozer.DozerConverter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class LocalDateTimeToStringConverter extends DozerConverter<LocalDateTime, String> {
    private static final Logger logger = LoggerFactory.getLogger(LocalDateTimeToStringConverter.class);

    public LocalDateTimeToStringConverter() {
        super(LocalDateTime.class, String.class);
    }

    @Override
    public String convertTo(LocalDateTime source, String destination) {
        if (source == null) return null;
        return source.atZone(ZoneId.systemDefault()).toInstant().toString();
    }

    @Override
    public LocalDateTime convertFrom(String source, LocalDateTime destination) {
        if (source == null) return null;

        try {
            return LocalDateTime.parse(source, DateTimeFormatter.ISO_DATE_TIME);
        } catch (DateTimeParseException ex) {
            logger.warn("Failed to convert String date to LocalDateTime: {}", source);
            return null;
        }
    }
}
