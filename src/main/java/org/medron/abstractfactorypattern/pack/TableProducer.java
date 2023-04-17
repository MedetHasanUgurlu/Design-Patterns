package org.medron.abstractfactorypattern.pack;

import org.medron.abstractfactorypattern.pack.factory.ModernTableFactory;
import org.medron.abstractfactorypattern.pack.factory.TableFactory;
import org.medron.abstractfactorypattern.pack.factory.VictorianTableFactory;

public class TableProducer {
    public static TableFactory getFactory(boolean isModern){
        if(isModern){
            return new ModernTableFactory();
        }
        return new VictorianTableFactory();
    }
}
