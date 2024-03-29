package com.ebridgevas.services.impl;

import com.ebridge.commons.dto.PduDto;
import com.ebridgevas.model.MTSM;
import com.ebridgevas.model.Message;
import com.ebridgevas.services.ServiceCommandProcessor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: David
 * Date: 2/24/13
 * Time: 10:43 AM
 * To change this template use File | Settings | File Templates.
 */
public class HelpServiceCommandProcessor implements ServiceCommandProcessor {

    /* TODO Add context sensitive help. */
    @Override
    public List<MTSM> process(PduDto pdu) {
        ArrayList<MTSM> result = new ArrayList<MTSM>();
        result.add(new MTSM(pdu.getSourceId(), pdu.getDestinationId(), Message.HELP));
        result.add(new MTSM(pdu.getSourceId(), pdu.getDestinationId(), Message.HELP2));
        return result;
    }
}
