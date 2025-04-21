interface Shape {
    
    abstract double getPerimeter();
}
class Rectangler implements Shape{
    double length;
    double breadth;
    double perimeter;
    Rectangler(double length , double breadth){
    this.length = length;
    this.breadth=breadth;
    }
    public double getPerimeter(){
        perimeter = 2*(length*breadth);
        return perimeter;
    }
}
class Circlec implements Shape{
    double radius;
    final static double pi = 3.14;
    double perimeter;
    Circlec(double radius){
        this.radius = radius;
    }
    public double getPerimeter(){
        perimeter = 2*pi*radius*radius;
        return perimeter;
    }
}
class Trianglet implements Shape{
    double side1;
    double side2;
    double side3;

    Trianglet(double side1,double side2,double side3){
     this.side1 = side1;
     this.side2=side2;
     this.side3=side3;
    }
    public double getPerimeter(){
        return (side1+side2+side3);
    }
}
class per{
    public static void main(String[] args){
        Rectangler r = new Rectangler(2.0,4.0);
        Circlec c = new Circlec(6.0);
        Trianglet t = new Trianglet(3.0,4.0,5.0);
       System.out.println(r.getPerimeter());
       System.out.println(c.getPerimeter());
       System.out.println(t.getPerimeter());
    }
}
