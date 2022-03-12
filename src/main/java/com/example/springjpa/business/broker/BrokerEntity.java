package com.example.springjpa.business.broker;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class BrokerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "broker_role")
    private String brokerRole;
}
