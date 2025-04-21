interface Studentlogin {
    
abstract String login(String id , String password);
}
class Verify implements Studentlogin{
    String id;
    String password;
    public String login(String id, String password){
        this.id = id ;
        this.password=password;
        if(id.equals("student24027") && password.equals("bhuvu")){
            return "Access Granted";
        }
        else{
            return "Access Denied";
        }
    }
}
class Logindetails{
    public static void main(String [] args){
        Verify o = new Verify();
       String result = o.login("student24027","bhuvu");
       System.out.println(result);
  }
}
