package one.digitalinnovation.personapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.validation.constraints.Email;

@Getter
@AllArgsConstructor
public enum PhoneType {

    HOME("Home"),
    MOBILE("Mobile"),
    COMMERCIAL("Commercial"),
    EMAIL("Email"),
    TWITTER("Twitter"),
    LINKEDIN("Linkedin"),
    INSTAGRAN("Instagran"),
    GITHUB("Github"),
    YOUTUBE("Youtube");

    private final String description;
}
