interface playable {
    abstract void play();
}
class football implements playable{
    public void play(){
    System.out.println("Football is widely famous among European countries");
    }
}
class basketball implements playable{
    public void play(){
        System.out.println("In basketball usually the players shoot");
    }
}
class volleyball implements playable{
    public void play(){
        System.out.println("Volleyball is being played");
    }
}
class plays{
    public static void main(String [] args){
        basketball b = new basketball();
        b.play();
        football f = new football();
        f.play();
        volleyball v = new volleyball();
        v.play();

    }
}
