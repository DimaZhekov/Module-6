interface Shape {
    void printName();
}
class Triangle implements Shape {
    @Override
    public void printName() {
        System.out.println("Triangle");
    }
}
class Square implements Shape {
    @Override
    public void printName() {
        System.out.println("Square");
    }
}

class Rectangle implements Shape {
    @Override
    public void printName() {
        System.out.println("Rectangle");
    }
}
class Pentagon implements Shape {
    @Override
    public void printName() {
        System.out.println("Pentagon");
    }
}
class Hexagon implements Shape {
    @Override
    public void printName() {
        System.out.println("Hexagon");
    }
}
class Octagon implements Shape {
    @Override
    public void printName() {
        System.out.println("Octagon");
    }
}
class Circle implements Shape {
    @Override
    public void printName() {
        System.out.println("Circle");
    }
}

class UniversalShape {
    private Shape shape;
    public void printShapeName(Shape shape) {
        shape.printName();
    }
}
