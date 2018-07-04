
public class Rectangle {
 private int width;
 private int breadth;
 
 	public Rectangle() {
 		width=breadth=1;
 		System.out.println("width"+width+"breadth"+breadth);
 	}
 	public Rectangle(int width,int breadth) {
 		this.width=width;
 		this.breadth=breadth;
 		System.out.println("width"+width+"breadth"+breadth);

 	}
 	public Rectangle(int size) {
 		this.width=size;
 		this.breadth=size;
 		System.out.println("width"+width+"breadth"+breadth);

 	}
 	
 
}
