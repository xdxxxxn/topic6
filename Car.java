public class Car {
  private int id;
  private String brand;
  private String model;
  private int yers;
  private String color;
  private double price;
  private String regnumber;

  public Car(int id, String brand, String model, int yers, String color, double price, String regnumber) {
    this.id = id;
    this.brand = brand;
    this.model = model;
    this.yers = yers;
    this.color = color;
    this.price = price;
    this.regnumber = regnumber;
  }
  public int getId() {
  return id;
  }
  public void setId(int id) {
  this.id = id;
  }
  public String getBrend() { 
  return brend; 
  }
  public void setId(String brand) { 
  this.brand = brand;
  }
  public String getModel() { 
  return model; 
  }
  public void setId(String model) { 
  this.model = model;
  }
  public int getYers() { 
  return yers; 
  }
  public void setYers(int yers) { 
  this.yers = yers;
  }
  public String getColor() { 
  return color; 
  }
  public void setColor(String color) { 
  this.color = color;
  }
  public double getPrice() { 
  return price; 
  }
  public void setPrice(double price) { 
  this.price = price;
  }
  public String getGetnumber() { 
  return getnumber; 
  }
  public void setGetnumber(String getnumber) { 
  this.regnumber = regnumber;
  }

}
