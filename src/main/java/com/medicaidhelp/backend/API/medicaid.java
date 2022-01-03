package com.medicaidhelp.backend.API;

import javax.persistence.*;

// Entity maps this class to our db (hibernate)
@Entity
@Table
public class medicaid {

    @SequenceGenerator(
            name = "state_sequence",
            sequenceName = "state_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "state_sequence"
    )

    @Id
    private Long id;
    private String stateName;

    @Basic
    private Boolean hasExpanded;

    public Boolean getHasExpanded() {
        return hasExpanded;
    }

    public void setHasExpanded(Boolean hasExpanded) {
        this.hasExpanded = hasExpanded;
    }
}
