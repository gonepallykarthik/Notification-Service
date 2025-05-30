package org.buzzly.notificationservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Customer extends Base {
    private  String name;
    private  String email;
    private  String phoneNumber;
    private  String address;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}
