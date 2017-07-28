/**
 * Created by esokolyanskaya on 27/07/2017.
 */
public class Factory
{
  public static void main(String[] args){
  
    AbstractLogger htmlLogger = new HtmlLogger();
    AbstractLogger jsonLogger = new JsonLogger();
    
    htmlLogger.saveToLog("First record");
    jsonLogger.saveToLog("Second record");
  
    System.out.println(htmlLogger.getCurrentClass());
    System.out.println(jsonLogger.getCurrentClass());
  }
}

abstract class AbstractLogger {
  
  abstract public void saveToLog(String record);
  
  public String getCurrentClass(){
    return this.getClass().getSimpleName();
  }
}

class HtmlLogger extends AbstractLogger {
  
  public void saveToLog(String record){
    System.out.println("We write to HTML file: " + record);
  }
}

class JsonLogger extends AbstractLogger {
  
  public void saveToLog(String record){
    System.out.println("We write to Json stream: " + record);
  }
}