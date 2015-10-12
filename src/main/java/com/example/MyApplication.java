package com.example;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by tada on 2015/10/12.
 */
@ApplicationPath("api")
public class MyApplication extends Application {
    @Override
    public Map<String, Object> getProperties() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("jersey.config.disableMoxyJson", Boolean.TRUE);
        return map;
    }
}
