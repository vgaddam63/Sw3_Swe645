package com.springboot.JPAmysql.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    @Column(name="first_name")
    private String first_name;

    @Column(name="last_name")
    private String last_name;

    @Column(name="email_id")
    private String email_id;

    @Column(name="student_id")
    private String studentid;

    @Column(name="street_address")
    private String street_address;

    @Column(name="city")
    private String city;

    @Column(name="country")
    private String country;

    @Column(name="state")
    private String state;

    @Column(name="zipcode")
    private long zipcode;

    @Column(name="telephone")
    private long telephone;

    @Column(name="survey_date")
    private String survey_date;

    @Column(name="likemost")
    private String likemost;

    @Column(name="interest")
    private String interest;

    @Column(name="comments")
    private String comments;

    @Column(name="recommend")
    private String recommend;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public String getStudent_id() {
        return studentid;
    }

    public void setStudent_id(String student_id) {
        this.studentid = student_id;
    }

    public String getStreet_address() {
        return street_address;
    }

    public void setStreet_address(String street_address) {
        this.street_address = street_address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public long getZipcode() {
        return zipcode;
    }

    public void setZipcode(long zipcode) {
        this.zipcode = zipcode;
    }

    public long getTelephone() {
        return telephone;
    }

    public void setTelephone(long telephone) {
        this.telephone = telephone;
    }

    public String getSurvey_date() {
        return survey_date;
    }

    public void setSurvey_date(String survey_date) {
        this.survey_date = survey_date;
    }

    public String getLikemost() {
        return likemost;
    }

    public void setLikemost(String likemost) {
        this.likemost = likemost;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getRecommend() {
        return recommend;
    }

    public void setRecommend(String recommend) {
        this.recommend = recommend;
    }
}
