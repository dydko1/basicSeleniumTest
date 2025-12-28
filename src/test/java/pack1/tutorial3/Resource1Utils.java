package pack1.tutorial3;

import lombok.SneakyThrows;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class Resource1Utils {

    @SneakyThrows
    public static String readClasspath(String path) {
        try (InputStream is = Resource1Utils.class.getClassLoader().getResourceAsStream(path)) {
            if (is == null) {
                throw new IllegalArgumentException("Missing classpath resource: " + path);
            }
            return new String(is.readAllBytes(), StandardCharsets.UTF_8);
        }
    }
}
