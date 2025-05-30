package org.buzzly.notificationservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class MessageTemplate extends Base {
    private String header;
    private String body;
    private String footer;
    @OneToOne(mappedBy = "messageTemplate")
    private Template template;
}
