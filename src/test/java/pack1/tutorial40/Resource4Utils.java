package pack1.tutorial40;

import lombok.SneakyThrows;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class Resource4Utils {

    @SneakyThrows
    public static String readClasspath(String path) {
        try (InputStream is = Resource4Utils.class.getClassLoader().getResourceAsStream(path)) {
            if (is == null)
                throw new IllegalArgumentException("Missing resource: " + path);
            return new String(is.readAllBytes(), StandardCharsets.UTF_8);
        }
    }
}