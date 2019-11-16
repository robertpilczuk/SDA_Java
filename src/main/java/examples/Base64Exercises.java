package examples;

import java.util.Base64;

public class Base64Exercises {

    public static void main(String[] args) {

        String base64 = new String(Base64
                .getEncoder()
                .encode("{\"name\":\"Zdzichu\"}".getBytes()));
        System.out.println(base64);

        byte[] decoded = Base64.getDecoder().decode(base64);
        String unbase64 = new String(decoded);
        System.out.println(unbase64);

        Base64.getEncoder().encode("username:password".getBytes());// Basic auth format
    }

}
