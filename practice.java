// interface Drawable{  
//     void draw();  
//     default void msg(){System.out.println("default method");}  
//     }  
//     class Rectangle implements Drawable{  
//     public void draw(){System.out.println("drawing rectangle");} 
//     public  void msg(){System.out.println("hello");} 
//     }  
//     class practice{  
//     public static void main(String args[]){  
//     Drawable d=new Rectangle();  
//     d.draw();  
//     d.msg();  
//     }}
// interface printable{  
//     void print();  
//     }  
//     class practice implements printable{  
//     public void print(){System.out.println("Hello");}  
      
//     public static void main(String args[]){  
//     practice obj = new practice();  
//     obj.print();  
//      }  
//     } 

class practice{
    public static void main(String args[]) {
        String s;
        s="hello";
        System.out.println(s.length());
       }
}