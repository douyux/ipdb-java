package net.ipip.ipdb;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class JsonUtils {
    private static final ObjectMapper mapper = new ObjectMapper();

    public static class JsonException extends RuntimeException {
        public JsonException(String msg) {
            super(msg);
        }

        public JsonException(Throwable cause) {
            super("json encode/decode exception", cause);
        }
    }

    public static <T> T readValue(String input, Class<T> clz) {
        if (input == null) {
            return null;
        }

        try {
            return mapper.readValue(input, clz);
        } catch (IOException e) {
            throw new JsonException(e);
        }
    }

    public static <T> T readValue(byte[] input, Class<T> clz) {
        if (input == null) {
            return null;
        }

        try {
            return mapper.readValue(input, clz);
        } catch (IOException e) {
            throw new JsonException(e);
        }
    }
}
