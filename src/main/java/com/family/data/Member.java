package com.family.data;

import org.springframework.data.annotation.Id;

import java.util.List;

/**
 * Created by kesavan on 11/21/2015.
 */
public class Member {
    @Id
    private String id;

    private String firstName;
    private String lastName;
    private String phone;

    private List<String> ancestors;
    private String parent;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<String> getAncestors() {
        return ancestors;
    }

    public void setAncestors(List<String> ancestors) {
        this.ancestors = ancestors;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }
}
