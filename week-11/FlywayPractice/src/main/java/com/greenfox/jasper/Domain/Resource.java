package com.greenfox.jasper.Domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Verőci Ádám on 2017.01.19..
 */
@Entity
@Table(name = "resource")
public class Resource {

    @Id
    protected String resourceType;

    protected Integer amount;

    public Resource() {
    }

    public Resource(String resourceType, Integer amount) {
        this.resourceType = resourceType;
        this.amount = amount;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
