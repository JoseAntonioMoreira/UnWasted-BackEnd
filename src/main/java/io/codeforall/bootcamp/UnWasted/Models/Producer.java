package io.codeforall.bootcamp.UnWasted.Models;

import jakarta.persistence.*;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@Entity
@Table(name = "producer")
public class Producer {
    @Id
    @Column(name = "producer_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String location;
    private String address;

    private String email;

    private String images;

    private String phone;

    private String password;
    @Column(name = "list_products")
    private String jsonData;


    public Producer(int id, String name, String location, String address, String email, String phone, String password, String jsonData) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.jsonData = jsonData;
    }

    public String getJsonData() {
        return jsonData;
    }

    public void setJsonData(String jsonData) {
        this.jsonData = jsonData;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public Producer() {

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


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
