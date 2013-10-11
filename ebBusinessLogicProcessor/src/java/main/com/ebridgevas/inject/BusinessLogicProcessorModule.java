package com.ebridgevas.inject;

import com.ebridgevas.services.BillingService;
import com.ebridgevas.services.ServiceCommandProcessor;
import com.ebridgevas.services.impl.BalanceEnquiryCommandProcessor;
import com.ebridgevas.services.impl.ZTEBillingService;
import com.google.inject.AbstractModule;

/**
 * david@ebridgevas.com
 *
 */
public class BusinessLogicProcessorModule extends AbstractModule {

    @Override
    protected void configure() {

        bind( BillingService.class ).to( ZTEBillingService.class );
        bind(ServiceCommandProcessor.class).to(BalanceEnquiryCommandProcessor.class);
    }
}
