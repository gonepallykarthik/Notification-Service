package org.buzzly.notificationservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Param extends Base {
    private String name;
    @ManyToOne
    @JoinColumn(name = "template_id", nullable = false)
    private Template template;
}
