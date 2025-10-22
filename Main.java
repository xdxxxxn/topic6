public class Main {
  public static void main(String[] args) {
    Car[] mass = {
        new Car(1, "Volvo", "XC90", 2022, "Чёрный", 55000.0, "V100VV"),
        new Car(2, "BMW", "X5", 2021, "Белый", 65000.0, "B200BM"),
        new Car(3, "Aston Martin", "DB11", 2023, "Серебристый", 250000.0, "A300AM"),
        new Car(4, "Volvo", "S60", 2020, "Синий", 35000.0, "V400VV"),
        new Car(5, "BMW", "M5", 2022, "Красный", 85000.0, "B500BM")
    };

    Car[] volvos = getCarByBrend(garage, "Volvo");
    System.out.println("Найдено Volvo: " + volvos.length);
    Car[] bmws = getCarByBrend(garage, "BMW");
    System.out.println("Найдено BMW: " + bmws.length);
    Car[] astons = getCarByBrend(garage, "Aston Martin");
    System.out.println("Найдено Aston Martin: " + astons.length);

  }

  public static Car[] getCarByBrend(Car[] cars, String brend) {
     int count = 0;
     for(int i = 0; i < cars.length; i++) {
       if(cars[i].getBrand().equals(brend)) {
         count++;
       }
     }

     Car[] res = new Car[count];

     int x = 0;
     for(int i =0; i < cars.length; i++) {
       if(cars[i].getBrand().equals(brend)) {
         res[x] = cars[i];
         x++;
       }
     }
     return res;
}

