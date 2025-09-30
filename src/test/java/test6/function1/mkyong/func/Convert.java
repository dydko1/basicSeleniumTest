package test6.function1.mkyong.func;

import org.apache.commons.codec.digest.DigestUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class Convert<T, R> {

    public <t1, r> Map<t1, r> convertListToMap(List<t1> list, Function<t1, r> func) {
        Map<t1, r> result = new HashMap<>();
        for (t1 t : list) {
            result.put(t, func.apply(t));
        }
        return result;
    }

    public Integer getLength(String str) {
        return str.length();
    }

    public String sha256(String str) {
        return DigestUtils.sha256Hex(str);
    }
}
