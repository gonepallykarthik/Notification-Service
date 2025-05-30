package org.buzzly.notificationservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "n_user")
@Data
public class User extends Base {
    private String username;
    private String email;
    private String password;
    @OneToMany(mappedBy = "user")
    private List<Customer> customers;
    @OneToMany(mappedBy = "user")
    private List<Template> templates;
}
