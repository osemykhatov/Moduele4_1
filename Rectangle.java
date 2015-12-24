package Module4_1_1;

public class Rectangle {

    private int sideA;
    private int sideB;
    private int areaRectangle;

    Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.areaRectangle = sideA * sideB;


    }
    public int getAreaRectangle(){
        return this.areaRectangle;
    }
}






