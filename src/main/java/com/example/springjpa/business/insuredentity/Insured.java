package com.example.springjpa.business.insuredentity;

import com.example.springjpa.business.common.AbstractEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "INSURED_ENTITY_GROUP")
public class Insured implements AbstractEntity, Serializable {

    private static final long serialVersionUID = 5001008823218087766L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "ENTITY_GROUP_NAME")
    private String entityGroupName;

    @Column(name = "APPROVED_BY_USER_ID")
    private String approvedByUserId;

    @Column(name = "ENTERED_BY_USER_ID")
    private String enteredByUserId;

    @OneToMany(mappedBy = "insured", cascade = CascadeType.REMOVE, orphanRemoval = true)
    private List<InsuredChild> childs;


    public Insured addInsuredChild(InsuredChild client) {
        childs.add(client);
        client.setInsured(this);
        return this;
    }

    public Insured removeClient(InsuredChild client) {
        childs.remove(client);
        client.setInsured(null);
        return this;
    }
}
