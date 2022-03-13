package com.example.springjpa.business.broker;

import com.example.springjpa.business.appreference.AppReferenceEntity;
import com.example.springjpa.business.appreference.BrokerRoleEntity;
import lombok.Data;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "Broker")
public class BrokerEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "broker_role")
    private String brokerRole;

    @ManyToOne
    @JoinColumn(name = "broker_role", referencedColumnName = "code", insertable = false, updatable = false)
    private BrokerRoleEntity role;
}
