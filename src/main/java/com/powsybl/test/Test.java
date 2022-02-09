package com.powsybl.test;

import com.powsybl.iidm.network.Network;
import com.powsybl.ieeecdf.converter.IeeeCdfNetworkFactory;
import com.powsybl.loadflow.LoadFlow;

public class Test {
    public static void main(String[] args) {
        Network network = IeeeCdfNetworkFactory.create300();
        LoadFlow.run(network);
    }
}
