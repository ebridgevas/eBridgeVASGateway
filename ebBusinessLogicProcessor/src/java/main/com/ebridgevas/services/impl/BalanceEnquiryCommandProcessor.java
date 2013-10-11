package com.ebridgevas.services.impl;

import com.ebridgevas.model.ServiceCommandRequest;
import com.ebridgevas.model.ServiceCommandResponse;
import com.ebridgevas.services.BillingService;
import com.ebridgevas.services.ServiceCommandProcessor;
import com.google.inject.Inject;

/**
 * david@ebridgevas.com
 *
 */
public class BalanceEnquiryCommandProcessor implements ServiceCommandProcessor {

    private final BillingService billingService;

    @Inject
    public BalanceEnquiryCommandProcessor( BillingService billingService ) {
        this.billingService = billingService;
    }

    @Override
    public ServiceCommandResponse process(ServiceCommandRequest request) {
        return billingService.balanceEnquiry(request);
    }
}
