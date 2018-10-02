/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.telmex.integration.onyx;

import java.util.ArrayList;
import javax.jws.WebResult;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author aleal
 */
@XmlRootElement(name = "fields")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fields", propOrder = {
    "entry"
} )
public class Fields {
    
    protected ArrayList<Entry> entry;

    @WebResult(name = "entry")
    public ArrayList<Entry> getEntry() {
        return entry;
    }

    public void setEntry(ArrayList<Entry> entry) {
        this.entry = entry;
    }
    
    
    
}
