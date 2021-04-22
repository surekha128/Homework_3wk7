package JavaStatementsMethods;

public class WallAreacalling {



    public static void main(String[] args) {
        WallArea wallArea=new WallArea();

        System.out.println("wallArea= "+ wallArea.getArea());
        wallArea.setHieght(6.3);
        wallArea.area(20.0,06.3);
        System.out.println("width= " + wallArea.getWidth());
        System.out.println("height= " + wallArea.getHeight());
        System.out.println("area= " + wallArea.getArea());

    }
}
