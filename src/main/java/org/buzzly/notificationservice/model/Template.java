package org.buzzly.notificationservice.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Template extends Base {
    private String name;
    @OneToMany(mappedBy = "template")
    private List<Param> params;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
    @OneToOne
    @JoinColumn(name = "messagaTemplate_id", nullable = false)
    private MessageTemplate messageTemplate;
    @OneToOne(mappedBy = "template")
    private Notification notification;
}
