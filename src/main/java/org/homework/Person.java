package org.homework;

import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

public class Person implements Serializable {
    //region Fields
    private String firstName;

    private String lastName;

    private int age;

    //endregion

    //region Constructors
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person() {
    }
    //endregion

    //region Getters and Setters

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //endregion

    //region helpMethods

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("firstname" + firstName)
                .append("lastName" + lastName)
                .append("age" + age).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17,37)
                .append(firstName)
                .append(lastName)
                .append(age).toHashCode();
    }
    //endregion
}
