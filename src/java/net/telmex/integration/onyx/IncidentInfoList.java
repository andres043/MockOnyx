/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.telmex.integration.onyx;

import javax.jws.WebResult;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author aleal
 */
@XmlRootElement(name = "incidentInfoList")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "incidentInfoList", propOrder = {
    "fields"
} )
public class IncidentInfoList {
    
    protected Fields fields;

    @WebResult(name = "fields")
    public Fields getFields() {
        return fields;
    }

    public void setFields(Fields fields) {
        this.fields = fields;
    }

    
    
}
