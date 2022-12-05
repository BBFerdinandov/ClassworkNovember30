package io.datajek.springmvc;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.InitBinder;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Past;

public class Athlete {
   //@NotNull(message="This is a required field.")

    public String getPrizeMoney() {
        return prizeMoney;
    }

    public void setPrizeMoney(String prizeMoney) {
        this.prizeMoney = prizeMoney;
    }

    @Past(message="Date must be in the past.")

    //private Date lastWon;

    @DateTimeFormat(pattern = "dd-MM-yyyy")

    @Min(value=1, message="Value must be greater than or equal to 1.")
    @Max(value=100, message="Value must be less than or equal to 100")

    //@Pattern(regexp="^\\$([0-9]{1,3},([0-9]{3},)*[0-9]{3})$", message="Incorrect format")
    private String prizeMoney;

    private Integer rank;
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
