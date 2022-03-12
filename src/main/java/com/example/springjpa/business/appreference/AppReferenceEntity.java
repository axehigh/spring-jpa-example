package com.example.springjpa.business.appreference;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "app_reference")
public class AppReferenceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "domain")
    private String domain;

    @Column(name = "code")
    private String code;

    @Column(name = "display_value")
    private String displayValue;
}
