package com.ebridgevas.services.impl;

import com.ebridge.commons.dto.PduDto;
import com.ebridgevas.model.MTSM;
import com.ebridgevas.services.ServiceCommandProcessor;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: David
 * Date: 3/16/13
 * Time: 3:33 AM
 * To change this template use File | Settings | File Templates.
 */
public class SimRegistrationServiceCommand implements ServiceCommandProcessor {
    @Override
    public List<MTSM> process(PduDto pdu) {
        return null;
    }
}
