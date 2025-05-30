package org.buzzly.notificationservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class TriggerType extends Base {
    private String type;
    @ManyToMany
    @JoinTable(name = "notification-trigger",
            joinColumns = @JoinColumn(name = "trigger_id"), // Column in join table for Student's PK
            inverseJoinColumns = @JoinColumn(name = "notification_id"))
    private List<Notification> notifications;
}
