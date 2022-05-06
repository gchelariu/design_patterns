package immutable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

public class ImmutableExemple {

    public static void main(String[] args) {
        final Contact contactOne = new Contact("0732561703", "Gabriel");
        Contact contactTwo = new Contact("123456789", "Andreea");
        System.out.println(contactOne);
        /**
         * Does not work*/
//        contactOne = contactTwo;
        System.out.println(contactOne);
    }
}

@Getter
@ToString
@AllArgsConstructor
final class Contact {

    private final String phoneNumber;
    private final String name;
}
