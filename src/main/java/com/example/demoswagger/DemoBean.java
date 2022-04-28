package com.example.demoswagger;

import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.constraints.Pattern;

@Schema
public class DemoBean {

    private static final String EMAIL_REGEX_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    @Schema(name = "Demo Name", description = "Demo Name field example")
    private String name;
    @Schema(name = "Demo Email", description = "Demo Email with bean-validation and example value", example = "valid@email.com")
    @Pattern(regexp = EMAIL_REGEX_PATTERN)
    private String email;
    @Schema(name = "Demo email confirm", description = "Demo email confirm with bean-validation and non example value")
    @Pattern(regexp = EMAIL_REGEX_PATTERN)
    private String confirmEmail;

    public DemoBean(String name, String email, String confirmEmail) {
        this.name = name;
        this.email = email;
        this.confirmEmail = confirmEmail;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getConfirmEmail() {
        return confirmEmail;
    }
}
