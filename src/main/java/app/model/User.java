package app.model;

import javax.validation.constraints.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class User {

    private int id;

    @Size(min = 2 , message = "name must be min 2 symbols")
    private String name;

    @Size(min = 2 , message = "name must be min 2 symbols")
    private String surname;

    @Max(value = 140, message = "must be less than 140")
    @Min(value = 1, message = "must be more than 0")
    private int age;

    @NotBlank(message = "sex is required field")
    private String sex;

    private String haveChildren;

    private String[] language;

    @Pattern(regexp = "\\d{3}-\\d{3}-\\d{2}-\\d{2}", message = "please use regex XXX-XXX-XX-XX")
    private String phoneNumber;

    @NotBlank(message = "emale is required field")
    private String emale;

    private Map<String,String> sexs;

    private Map<String,String> haveChildrens;

    private Map<String,String> languages;

    public User(){
        sexs = new HashMap<>();
        sexs.put("M", "Male");
        sexs.put("F", "Female");

        haveChildrens = new HashMap<>();
        haveChildrens.put("Y", "Yes");
        haveChildrens.put("N", "No");

        languages = new HashMap<>();
        languages.put("En", "English");
        languages.put("Fr", "French");
        languages.put("Ru", "Russian");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmale() {
        return emale;
    }

    public void setEmale(String emale) {
        this.emale = emale;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Map<String, String> getSexs() {
        return sexs;
    }

    public void setSexs(Map<String, String> sexs) {
        this.sexs = sexs;
    }

    public String getHaveChildren() {
        return haveChildren;
    }

    public void setHaveChildren(String haveChildren) {
        this.haveChildren = haveChildren;
    }

    public Map<String, String> getHaveChildrens() {
        return haveChildrens;
    }

    public void setHaveChildrens(Map<String, String> haveChildrens) {
        this.haveChildrens = haveChildrens;
    }

    public String[] getLanguage() {
        return language;
    }

    public void setLanguage(String[] language) {
        this.language = language;
    }

    public Map<String, String> getLanguages() {
        return languages;
    }

    public void setLanguages(Map<String, String> languages) {
        this.languages = languages;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", haveChildren='" + haveChildren + '\'' +
                ", language=" + Arrays.toString(language) +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", emale='" + emale + '\'' +
                ", sexs=" + sexs +
                ", haveChildrens=" + haveChildrens +
                ", languages=" + languages +
                '}';
    }
}
