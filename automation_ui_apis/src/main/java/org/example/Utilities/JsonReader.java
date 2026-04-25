package org.example.utilities;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonReader {
    private static final ObjectMapper mapper = new ObjectMapper();

    public static <T> T deserializeJson(String filePath, Class<T> clazz) {
        try {

            return mapper.readValue(new File(filePath), clazz);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Can not read this file: " + filePath);
        }
    }

    public static <T> Stream<T> deserializeJsonList(String filepath, Class<T> clazz) {
        try {
            MappingIterator<T> iterator = mapper.readerFor(clazz).readValues(new File(filepath));
            return StreamSupport.stream(Spliterators.spliteratorUnknownSize(iterator, Spliterator.ORDERED), false);
        } catch (IOException e) {
            throw new RuntimeException("Error reading JSON stream from: " + filepath, e);
        }
    }
}
