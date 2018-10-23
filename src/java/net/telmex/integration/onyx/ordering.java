/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.telmex.integration.onyx;

import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author aleal
 */
@WebService(serviceName = "ordering")
public class ordering {

    /**
     * This is a sample web service operation
     *
     * @param incidentId
     * @param mode
     * @return
     */
    @WebMethod(operationName = "getIncidentInfo")
    @WebResult(name = "incidentInfoList")
    public IncidentInfoList getIncidentInfo(@WebParam(name = "incidentId") 
            @XmlElement(required = true) String incidentId, @WebParam(name = "mode") 
            @XmlElement(required = true) String mode) {
        
        System.out.println("Indecidente: " + incidentId);
        if (incidentId.equals("1234") || incidentId.equals("0000")) {
        System.out.println("Indecidente: " + incidentId + " en condicional");
            
            String[] key = {"CODIGO", "TIPO", "NUM_USER", "DESCRIPCION", "FECHAIN", "iIncidentCategory", 
            "ENLACES", "FECHAMOD", "vchUser1", "vchUser5", "iStatusId", "ESTADOID", 
            "EMAIL", "CATEGORIA", "chAssignedTo", "PADRE", "PRIORIDAD", "OT", "CUENTA", 
            "TELEFONO", "vchDesc1", "iOwnerId", "PARAMETROID", "CIUDAD", "NIT", 
            "USUARIO_ASIGNADO", "DIRECCION", "ESTADO", "iIncidentTypeId", 
            "COMPANIA", "PAIS", "IT_IN", "CIUDADREAL", "USERNAME"};

            String[] value = {"101545", "Entrega de Servicio Ins.", "", "Comercio al por menor, en esta", 
            "2000-07-07 12:00:00.0", "11", "", "2018-09-18 15:52:00.0", "", "",
            "101465", "101465", "almacenes.exito@exito.com.co", "Documentación", "EGU3728A", 
            "5836532", "127", "5975363", "13198", "57-4-3396565", "CALARCA // ENTREGA DE SERVICIO", 
            "13198", "111094", "ANTIOQUIA", "890900608-9", "JONATHAN JAHIR BARRERA GOMEZ", 
            "Cra. 48  32B Sur-139", "Cerrada", "111094", "ALMACENES EXITO S.A.", "CO", 
            "CALARCA // ENTREGA DE SERVICIO", "ENVG", "JONATHAN JAHIR BARRERA GOMEZ"};

            IncidentInfoList iil = new IncidentInfoList();
            Entry e;
            Fields f = new Fields();
            ArrayList<Entry> a = new ArrayList();

            for (int i = 0; i < key.length; i++) {
                e = new Entry();
                e.setKey(key[i]);
                e.setValue(value[i]);
                a.add(e);
            }

            f.setEntry(a);
            iil.setFields(f);
            
            return iil;            
        }else 
            return null;
    }
      
    
}
