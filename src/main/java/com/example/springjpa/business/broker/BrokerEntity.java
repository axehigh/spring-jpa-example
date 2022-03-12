package com.example.springjpa.business.broker;

import com.example.springjpa.business.appreference.AppReferenceEntity;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Broker")
public class BrokerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "broker_role")
    private String brokerRole;

    @ManyToOne
    @JoinColumn(name = "broker_role", referencedColumnName = "code", insertable = false, updatable = false)
    private AppReferenceEntity role;
}
