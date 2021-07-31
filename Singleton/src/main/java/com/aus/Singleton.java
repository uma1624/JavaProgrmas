package  com.aus;
public class Singleton {
  private  static Singleton singleton  = null;
  public  static synchronized Singleton getInstance(){
      if(singleton==null){
          singleton = new Singleton();
      }
      return  singleton;
  }
}
