# Abstract Factory Pattern
![img.png](img.png)
<br>


    public interface Table {
    }
    
    public class ModernTable implements Table {
    }

    public class VictorianTable implements Table {
    }
<br>


    public interface TableFactory {
        Table createTable();
    }
    public class ModernTableFactory implements TableFactory {
        @Override
        public Table createTable() {
            return new ModernTable();
        }
    }
    public class VictorianTableFactory implements TableFactory {
        @Override
        public Table createTable() {
            return new VictorianTable();
        }
    }
<br>

    public class TableProducer {
        public static TableFactory getFactory(boolean isModern){
            if(isModern){
                return new ModernTableFactory();
            }
            return new VictorianTableFactory();
        }
    }
<br>

        public static void main(String[] args) {
            Table table = TableProducer.getFactory(true).createTable();
            System.out.println(table.getClass().getSimpleName());
        }
<br>

**Result**\
ModernTable

# [«««](https://github.com/MedetHasanUgurlu/Design-Patterns)

