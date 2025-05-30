package org.buzzly.notificationservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class TransactionLog extends Base {
    private String status;
    @OneToOne
    @JoinColumn(name = "notification_id", nullable = false)
    private Notification notification;
}
