package com.example.demo.config;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class TestMain {
    public static void main(String[] args) {
        String token = "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJPcGVuQXBpIiwiWC1BUFBMSUNBVElPTi1TRUxMRVItQ0hBTk5FTC1JRCI6NDgsIkVOVklST05NRU5ULUNPREUiOiJwcm9kIiwiWC1BUFBMSUNBVElPTi1TRUxMRVItQ0hBTk5FTC1DT0RFIjoiYml6cGxheS1hcGkiLCJYLUFQUExJQ0FUSU9OLVNVUFBMSUVSLUNPREUiOiJZRU9HSSIsIlgtQVBQTElDQVRJT04tVVNFUi1JRCI6NCwiZXhwIjoyMDI5ODIwNDAxfQ.0TD98LDNJpLexOg9bk5sR1lbtOvx158RS-EihxErBt_afaJ9elYspOnoQBHeUpkmhJZDugx73jJKWbBfXfZ6Xw";
        String[] splitToken = token.split("\\.");
        String header = new String(Base64.getUrlDecoder().decode(splitToken[0]), StandardCharsets.UTF_8);
        String payload = new String(Base64.getUrlDecoder().decode(splitToken[1]), StandardCharsets.UTF_8);
//        String signature = new String(Base64.getUrlDecoder().decode(splitToken[2]), StandardCharsets.UTF_8);

        System.out.println("Header: " + header);
        System.out.println("Payload: " + payload);
//        System.out.println("Signature: " + signature);

    }
}