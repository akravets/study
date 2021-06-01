package maps;

import com.sun.org.slf4j.internal.LoggerFactory;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Logger;

public class Maps {
    static Map<String,String> map = new HashMap<>();

    public static void main(String[] args) {
        map.put("one", "bob");
        map.put("two", "john");

        Logger log = Logger.getAnonymousLogger();

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while(iterator.hasNext()){
            Map.Entry<String, String> next = iterator.next();
            log.info(next.getKey());
            log.info(next.getValue());

        }

    }
}
