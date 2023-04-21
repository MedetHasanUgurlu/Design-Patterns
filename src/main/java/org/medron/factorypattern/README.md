# Factory Pattern

![img_2.png](img_2.png)

<br>

    public interface Shape {
        void info();
    }
<br>

    public class Circle implements Shape{
        @Override
        public void info() {
            System.out.println("Circle...");
        }
    }
<br>  

    public class Square implements Shape{
        @Override
        public void info() {
            System.out.println("Square");
        }
    }

<br>    
Using Enum

    public enum ShapeFactoryV2 {
    Circle{
        @Override
        public Shape createShape() {
            return new Circle();
        }

    },
    Square{
        @Override
        public Shape createShape() {
            return new Square();
        }
    };
    public abstract Shape createShape();
    }

<br>

    public static void main(String[] args) {
        Shape s = ShapeFactoryV2.Circle.createShape();
        s.info();
    }

# [«««](https://github.com/MedetHasanUgurlu/Design-Patterns)





