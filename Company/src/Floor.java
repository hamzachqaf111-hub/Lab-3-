public class Floor {
    double width ;
    double length;
    public Floor(double width,double length){
        if ( length < 0 ){
            length= 0;
        }
        else {
            this.length = length;
        }
        if ( width < 0 ){
            width = 0;
        }
        else {
            this.width = width;
        }
    }
    public double getArea() {
        return width * length;
    }

}
