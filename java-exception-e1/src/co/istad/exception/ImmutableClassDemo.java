package co.istad.exception;

import java.time.LocalDateTime;

public class ImmutableClassDemo {
    public static void main(String[] args) {
        Person p = new Person("Dara", "Male");
        System.out.println(p.name());
        System.out.println(p.gender());

        Payload payload = new Payload("My data",
                "Get data successfully",
                LocalDateTime.now(),
                true);
        System.out.println(payload.data());
        System.out.println(payload.message());
    }
}
