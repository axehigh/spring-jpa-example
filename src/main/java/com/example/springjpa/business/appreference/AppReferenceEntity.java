package com.example.springjpa.business.appreference;

import lombok.Data;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "app_reference")
@Where(clause = "domain='BROKER_ROLE'")
public class AppReferenceEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "domain")
    private String domain;

    @Column(name = "code")
    private String code;

    @Column(name = "display_value")
    private String displayValue;
}
