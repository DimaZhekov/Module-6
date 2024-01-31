 class Main {
    public static void main(String[] args) {
        UniversalShape universalShape = new UniversalShape();
        Shape triangle = new Triangle();
        universalShape.printShapeName(triangle);

        Shape square = new Square();
        universalShape.printShapeName(square);

        Shape rectangle = new Rectangle();
        universalShape.printShapeName(rectangle);

        Shape pentagon = new Pentagon();
        universalShape.printShapeName(pentagon);

        Shape hexagon = new Hexagon();
        universalShape.printShapeName(hexagon);

        Shape octagon = new Octagon();
        universalShape.printShapeName(octagon);

        Shape circle = new Circle();
        universalShape.printShapeName(octagon);

    }
    }

