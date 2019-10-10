package utils;

import com.google.gson.Gson;

import java.util.List;
import java.util.stream.Stream;

public class JsonUtil {

    public static <T> String convertListToJson(List<T> list) {
        String json = new Gson().toJson(list);
        System.out.println(json);
        return json;
    }

}
