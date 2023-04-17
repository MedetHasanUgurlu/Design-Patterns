package org.medron.abstractfactorypattern.pack.factory;

import org.medron.abstractfactorypattern.pack.entity.Table;
import org.medron.abstractfactorypattern.pack.entity.VictorianTable;
import org.medron.abstractfactorypattern.pack.factory.TableFactory;

public class VictorianTableFactory implements TableFactory {
    @Override
    public Table createTable() {
        return new VictorianTable();
    }
}
