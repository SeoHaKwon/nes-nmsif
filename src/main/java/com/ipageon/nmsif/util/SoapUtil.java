package com.ipageon.nmsif.util;

import org.springframework.stereotype.Component;
import com.kt.bcn.adaptor.equip.server.service.as.String;
@Component
public class SoapUtil {
    public String setXmlString(java.lang.String value) {
        String var = new String();
        var.setValue(value);
        return var;
    }
    
	public Integer setXmlInteger(java.lang.String value) {
        Integer var = Integer.parseInt(value);
        return var;
    }
}
