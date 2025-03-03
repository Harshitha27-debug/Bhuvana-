
class Myclass{
// class starts here
static int Count = 0;
final double pi = 3.1415;
// the constructor starts here 
Myclass(){
Count++;
}
// the constructor ends here
public static void main(String[] args){
Myclass c1 = new Myclass();
Myclass c2 = new Myclass();
System.out.println("Count : " + c1.Count);
System.out.println("Pi : " + c1.pi);
}
}
// class ends here





