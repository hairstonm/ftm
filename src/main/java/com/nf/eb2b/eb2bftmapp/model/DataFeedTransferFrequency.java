package com.nf.eb2b.eb2bftmapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DATAFEED_TRANSFER_FREQUENCY")
public class DataFeedTransferFrequency {

    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "VERSION")
    private Integer version;

    @Column(name = "DATAFEED_TRANSFER_FREQUENCY")
    private String dataFeedTransferFrequency;

    public DataFeedTransferFrequency() {
        // JPA
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getDataFeedTransferFrequency() {
        return dataFeedTransferFrequency;
    }

    public void setDataFeedTransferFrequency(String dataFeedTransferFrequency) {
        this.dataFeedTransferFrequency = dataFeedTransferFrequency;
    }

    @Override
    public String toString() {
        return "DataFeedTransferFrequency{" +
                "id=" + id +
                ", version=" + version +
                ", dataFeedTransferFrequency='" + dataFeedTransferFrequency + '\'' +
                '}';
    }
}
