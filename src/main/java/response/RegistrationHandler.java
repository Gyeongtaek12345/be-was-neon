package response;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

import static java.net.URLDecoder.decode;

public class RegistrationHandler {

    public static Map<String, String> extractUserData(String fileName) throws UnsupportedEncodingException {
        String[] params = fileName.split("&");
        Map<String, String> paramMap = new HashMap<>();
        for (String param : params) {
            String[] keyValue = param.split("="); // "="를 기준으로 파라미터를 키-값으로 나눕니다.
            paramMap.put(keyValue[0],decode(keyValue[1],"UTF-8"));
        }
        return paramMap;
    }
}
