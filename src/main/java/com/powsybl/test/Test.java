package com.powsybl.test;

import com.powsybl.ieeecdf.converter.IeeeCdfNetworkFactory;
import com.powsybl.iidm.network.Network;
import com.powsybl.loadflow.LoadFlow;
import com.powsybl.nad.NetworkAreaDiagram;

import java.nio.file.Paths;

public class Test {
    public static void main(String[] args) {
        Network network = IeeeCdfNetworkFactory.create14();
        LoadFlow.run(network);
        new NetworkAreaDiagram(network)
                .draw(Paths.get("test.svg"));
    }
}
