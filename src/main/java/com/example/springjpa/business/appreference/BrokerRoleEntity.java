package com.example.springjpa.business.appreference;

import lombok.Data;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "app_reference")
@Where(clause = "domain='ROLE'")
public class BrokerRoleEntity implements Serializable {
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "code")
    private String code;

    @Column(name = "display_value")
    private String displayValue;
}
