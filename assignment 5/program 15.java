class Shape {
    double calculateArea() {
        return 0;
    }
}

class Circle extends Shape {
    @Override
    double calculateArea() {
        return 3.14 * 5 * 5;
    }
}

class Rectangle extends Shape {
    @Override
    double calculateArea() {
        return 10 * 5;
    }
}

class ShapeDemo {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();

        System.out.println("Circle Area: " + c.calculateArea());
        System.out.println("Rectangle Area: " + r.calculateArea());
    }
}