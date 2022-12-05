package io.datajek.springmvc;

import org.springframework.web.bind.annotation.InitBinder;

public class Athlete {
    private String firstName;
    //@NotNull(message="This is a required field.")
    //@Size(min=1, message = "This is a required field.")
    private String lastName;
    private String country;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    /*@InitBinder
    public void initBinder(WebDataBinder binder) {
        String TrimmerEditor editor = new StringTrimmerEditor(true);
        binder.registerCustomEditor(String.class, editor);
    }*/


}
