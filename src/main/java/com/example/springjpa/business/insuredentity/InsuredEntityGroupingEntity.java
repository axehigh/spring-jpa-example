package com.example.springjpa.business.insuredentity;

import com.example.springjpa.business.common.AbstractEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "INSURED_ENTITY_GROUPING")
public class InsuredEntityGroupingEntity implements AbstractEntity, Serializable {

    private static final long serialVersionUID = 9011037026260314210L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "ENTITY_GROUP_ID")
    private Integer entityGroupId;

    @Column(name = "ENTITY_CODE")
    private String entityCode;

    @Column(name = "SEQUENCE_NO")
    private Integer sequenceNo;

    @Column(name = "APPROVED_BY_USER_ID")
    private String approvedByUserId;

    @Column(name = "ENTERED_BY_USER_ID")
    private String enteredByUserId;

    @ManyToOne
    @JoinColumn(name = "insured_entity_group", referencedColumnName = "id", insertable = false, updatable = false)
    private InsuredEntityGroupEntity insuredEntityGroupEntity;

}
