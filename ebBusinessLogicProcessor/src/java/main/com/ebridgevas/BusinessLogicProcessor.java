package com.ebridgevas;

import com.ebridgevas.inject.BusinessLogicProcessorModule;
import com.ebridgevas.model.ServiceCommandRequest;
import com.ebridgevas.model.ServiceCommandResponse;
import com.ebridgevas.model.tree.Content;
import com.ebridgevas.model.tree.ServiceCommandTree;
import com.ebridgevas.model.tree.TreeNode;
import com.google.inject.Guice;
import com.google.inject.Injector;

import java.util.List;

/**
 * david@ebridgevas.com
 *
 */
public class BusinessLogicProcessor {

    public static void main(String[] args) {

        Injector injector = Guice.createInjector(new BusinessLogicProcessorModule());

        ServiceCommandTree serviceCommandTree =
                injector.getInstance(ServiceCommandTree.class);

        ServiceCommandRequest balanceEnquiry = new ServiceCommandRequest();

        Comparable<Content> content = new Comparable<Content>() {
            @Override
            public int compareTo(Content o) {
                return 0;
            }
        };

        TreeNode<Content> node = serviceCommandTree.getRoot().findTreeNode(content);

        ServiceCommandResponse response = node.data.getServiceCommandProcessor().process(balanceEnquiry);
    }
}
