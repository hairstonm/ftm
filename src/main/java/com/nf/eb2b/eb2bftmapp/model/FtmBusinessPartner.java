package com.nf.eb2b.eb2bftmapp.model;

import javax.persistence.*;

@Entity
@Table(name = "FTM_BUSINESS_PARTNER")
public class FtmBusinessPartner {

    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "BUSINESS_PARTNER_ID")
    private Integer businessPartnerId;

    /*
    * @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "BUSINESS_PARTNER_ID")
    private BusinessPartner businessPartner;*/

    @Column(name = "SHORT_NAME")
    private String shortName;

    @Column(name = "VERSION")
    private Integer version;

    public FtmBusinessPartner() {
        // JPA ??
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBusinessPartnerId() {
        return businessPartnerId;
    }

    public void setBusinessPartnerId(Integer businessPartnerId) {
        this.businessPartnerId = businessPartnerId;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "FtmBusinessPartner{" +
                "id=" + id +
                ", businessPartnerId=" + businessPartnerId +
                ", shortName='" + shortName + '\'' +
                ", version=" + version +
                '}';
    }
}
