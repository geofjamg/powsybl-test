package com.powsybl.test;

import com.powsybl.iidm.import_.Importers;
import com.powsybl.iidm.network.Network;

public class Test {
    public static void main(String[] args) {
        Network network = Importers.loadNetwork("<FOLDER>/CGMES_v2_4_15_MicroGridTestConfiguration_BC_BE_v2.zip");
    }
}
