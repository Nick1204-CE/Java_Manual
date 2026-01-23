class rectangle
{
   double height,width;
   
	rectangle(){
	height=1;
	width=1;
	}   
      
	rectangle(double h,double w){
	height=h;
	width=w;
	}

	double getArea()
	{
	return width*height;
}

	double getPerimeter()
	{
	return 2*(width+height);
}

     public static void main(String args[]){

	rectangle a= new rectangle();
	System.out.println("****************");
	System.out.println("  rectangle 1");
	System.out.println("****************");
	System.out.println("Height:"+a.height);
	System.out.println("Width:"+a.width);
	System.out.println("Area:"+a.getArea());
	System.out.println("Perimeter:"+a.getPerimeter());
	System.out.println("");

	rectangle b= new rectangle(13,10);
	System.out.println("****************");
	System.out.println("  rectangle 2");
	System.out.println("****************");
	System.out.println("Height:"+b.height);
	System.out.println("Width:"+b.width);
	System.out.println("Area:"+b.getArea());
	System.out.println("Perimeter:"+b.getPerimeter());

	
}
}