package Module4_1_1;


public class Calculate {
    public static void main(String[] args) {


        Triangle squareTri = new Triangle(20, 10);
        Rectangle squareRec = new Rectangle(5, 17);
        Circle squareCir = new Circle(9);


        System.out.println("The area of Triangle is " + squareTri.getAreaTriangle());
        System.out.println("The area of Rectangle is " + squareRec.getAreaRectangle());
        System.out.println("The area of Circle is " + squareCir.getAreaCircle());



    }

}


