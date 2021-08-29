package one.digitalinnovation.personapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PhoneType {

    MOBILE("Mobile"),
    HOME("Home"),
    COMMERCIAL("Comercial");

    private final String desccription;

}
