import java.util.ArrayList;
import java.util.List;

/**
 * Created by Eva Sokolyanskaya on 28/07/2017.
 * Builder pattern implementation
 */
public class Builder
{
  public static void main (String[] args) {
    Director director = new Director();
    GuitarBuilder bassBuilder = new BassGuitar();
    director.setGuitarBuilder(bassBuilder);
    director.constructGuitar();
    
    Guitar guitar = director.getGuitar();
    System.out.println(guitar.color + ", " + guitar.material + ", " + guitar.strings_number);
  
    List<Guitar> guitarList = new ArrayList();
//    guitarList.add()
  }
}

class Guitar {
  String material = null;
  String strings_number = null;
  String color = null;
  
  public void setMaterial(String material)  {
    this.material = material;
  }
  
  public void setStrings_number(String strings_number)  {
    this.strings_number = strings_number;
  }
  
  public void setColor(String color)  {
    this.color = color;
  }
}

abstract class GuitarBuilder {
  protected Guitar guitar;
  
  public Guitar getGuitar() {
    return guitar;
  }
  
  public void createNewGuitar() {
    guitar = new Guitar();
  }
  
  public abstract void buildMaterial();
  public abstract void buildStrings_number();
  public abstract void buildColor();
  
}

class BassGuitar extends GuitarBuilder {
  
  public void buildMaterial() {
    guitar.setMaterial("Ash");
  }
  
  public void buildStrings_number(){
    guitar.setStrings_number("4");
  }
  public void buildColor() {
    guitar.setColor("Black");
  }
}

class Balalayka extends GuitarBuilder {
  
  public void buildMaterial() {
    guitar.setMaterial("Birch");
  }
  
  public void buildStrings_number(){
    guitar.setStrings_number("3");
  }
  public void buildColor() {
    guitar.setColor("Wood");
  }
}

class Director {
  private GuitarBuilder guitarBuilder;
  
  public void setGuitarBuilder(GuitarBuilder guitarBuilder){
    this.guitarBuilder = guitarBuilder;
  }
  
  public Guitar getGuitar() {
    return guitarBuilder.getGuitar();
  }
  
  public void constructGuitar() {
    guitarBuilder.createNewGuitar();
    guitarBuilder.buildMaterial();
    guitarBuilder.buildStrings_number();
    guitarBuilder.buildColor();
  }
}
