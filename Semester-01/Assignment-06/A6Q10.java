public class A6Q10 {
    public static void area(int side)
    {
    int area=side*side;
    System.out.println("The area of the square is "+area);
    }
    
    public static void area(double r)
    {
    double area =Math.PI * r * r;
    System.out.println("The area of the circle is "+area);
    }
    public static void area(int length, double width)
    {
    double area = length * width;
    System.out.println("The area of the rectangle is "+area);
    }
    public static void area(double base, int height)
    {
    double area = 0.5*base * height;
    System.out.println("The area of the Triangle is "+area);
    }
   public static void main(String[] args) {
   area(5);//It will invoke the area method of Square
   area(3.75);//It will invoke the area method of Circle
   area(6,4.15 );//It will invoke the area method of Rectangle
   area(2.71,4);//It will invoke the area method of Triangle
   }
}
   