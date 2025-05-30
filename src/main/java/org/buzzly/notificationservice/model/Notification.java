package org.buzzly.notificationservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Notification extends Base{
    private String name;
    private String type;
    @OneToOne
    @JoinColumn(name = "template_id", nullable = false)
    private Template template;
    @ManyToMany(mappedBy = "notifications")
    private List<TriggerType> triggerTypes;
    @OneToOne(mappedBy = "notification")
    private TransactionLog transactionLog;
}
