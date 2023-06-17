package ClassBox;

public class ClassBox {
    private double length;
    private double width;
    private double height;

    public ClassBox(double length, double width, double height) {
        setLength(length);
        setWidth(width);
        setHeight(height);
    }

    private void setLength(double length) {
        if(length<0){
            throw new IllegalArgumentException("Length cannot be zero or negative.");
        }
        this.length = length;
    }

    private void setWidth(double width) {
        if(width<0){
            throw new IllegalArgumentException("Width cannot be zero or negative.");
        }
        this.width = width;
    }

    private void setHeight(double height) {
        if(height<0){
            throw new IllegalArgumentException("Height cannot be zero or negative.");
        }
        this.height = height;
    }

    public void calculateSurfaceArea (){
        //Surface Area = 2lw + 2lh + 2wh
        double surfaceArea = 2*length*width + 2*length*height + 2*width*height;
        System.out.printf("Surface Area - %.2f%n", surfaceArea);

    }

    public void calculateLateralSurfaceArea (){
       // Lateral Surface Area = 2lh + 2wh
        double lateralSurfaceArea = 2*length*height+2*width*height;
        System.out.printf("Lateral Surface Area - %.2f%n",lateralSurfaceArea);

    }

    public void calculateVolume (){
        //Volume = lwh
        double volume = length*width*height;
        System.out.printf("Volume - %.2f%n",volume);

    }






}
