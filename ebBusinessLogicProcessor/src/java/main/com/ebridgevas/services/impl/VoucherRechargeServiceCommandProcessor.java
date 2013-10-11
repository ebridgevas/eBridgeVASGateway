package com.ebridgevas.services.impl;

import com.ebridge.commons.dto.PduDto;
import com.ebridgevas.model.MTSM;
import com.ebridgevas.services.ServiceCommandProcessor;
import com.ebridgevas.util.MobileNumberFormatter;

import java.util.List;

import static com.ebridgevas.services.ServerPDUEventListenerImpl.PREPAID_ACCOUNT_MANAGER;

/**
 * Created with IntelliJ IDEA.
 * User: David
 * Date: 2/24/13
 * Time: 10:38 AM
 * To change this template use File | Settings | File Templates.
 */
public class VoucherRechargeServiceCommandProcessor implements ServiceCommandProcessor {

    @Override
    public List<MTSM> process(PduDto pdu) {
        String[] tokens = pdu.getShortMessage().split("#");
        return PREPAID_ACCOUNT_MANAGER.voucherRecharge(
                pdu,
                MobileNumberFormatter.format(tokens[1]),
                tokens[0]);
    }
}
