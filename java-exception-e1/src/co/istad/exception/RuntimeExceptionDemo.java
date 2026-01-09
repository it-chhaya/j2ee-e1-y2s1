package co.istad.exception;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class RuntimeExceptionDemo {
    public static void main(String[] args) {
        Map<String, Object> dictionary = new HashMap<>();
        List<String> data = List.of("Apple", "Samsung", "Nokia");
        //dictionary.put("data", data);
        dictionary.put("message", "Data is retrieved successfully");
        dictionary.put("isSucceed", true);
        dictionary.put("timestamp", System.currentTimeMillis());
        dictionary.put("status", false);

        isValidDictionary(dictionary);

        dictionary.forEach((s, o) -> {
            System.out.println(s + ":" + o);
        });
    }

    private static void isValidDictionary(Map<String, Object> dictionary) {
        // Valid keys -> data, message, isSucceed, timestamp
        String[] validKeys = {"data", "message", "isSucceed", "timestamp"};
        Set<String> keys = dictionary.keySet();

        if (keys.size() != validKeys.length) {
            throw new KeySizeException("Key size is not valid");
        }

        for (String key : validKeys) {
            if (!dictionary.containsKey(key))
                throw new KeyNotFoundException("Key: " + key + " not exists");
        }

    }
}
