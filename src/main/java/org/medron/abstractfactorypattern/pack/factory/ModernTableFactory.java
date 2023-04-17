package org.medron.abstractfactorypattern.pack.factory;

import org.medron.abstractfactorypattern.pack.entity.ModernTable;
import org.medron.abstractfactorypattern.pack.entity.Table;
import org.medron.abstractfactorypattern.pack.factory.TableFactory;

public class ModernTableFactory implements TableFactory {
    @Override
    public Table createTable() {
        return new ModernTable();
    }
}
