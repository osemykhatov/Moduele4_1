package Module4_1_1;


public class Triangle {

    private int baseTriangle;
    private int heightTriangle;
    private int areaTriangle;

    Triangle(int baseTriangle, int heightTriangle) {

        this.baseTriangle = baseTriangle;
        this.heightTriangle = heightTriangle;
        this.areaTriangle = (baseTriangle * heightTriangle) / 2;

            }
    public int getAreaTriangle(){
        return this.areaTriangle;

    }
}