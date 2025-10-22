public class Main {
  public static void main(String[] args) {
    Car[] mass = {
        new Car(1, "Volvo", "XC90", 2022, "Чёрный", 55000.0, "V100VV"),
        new Car(2, "BMW", "X5", 2021, "Белый", 65000.0, "B200BM"),
        new Car(3, "Aston Martin", "DB11", 2023, "Серебристый", 250000.0, "A300AM"),
        new Car(4, "Volvo", "S60", 2020, "Синий", 35000.0, "V400VV"),
        new Car(5, "BMW", "M5", 2022, "Красный", 85000.0, "B500BM")
    };

    Car[] volvos = getCarByBrend(mass, "Volvo");
    System.out.println("Найдено Volvo: " + volvos.length);
    Car[] bmws = getCarByBrend(mass, "BMW");
    System.out.println("Найдено BMW: " + bmws.length);
    Car[] astons = getCarByBrend(mass, "Aston Martin");
    System.out.println("Найдено Aston Martin: " + astons.length);

    Car[] oldVolvos = getCarByBrendAndYearOperational(mass, "Volvo", 1);
    System.out.println("Volvo старше 1 года: " + oldVolvos.length);
    Car[] oldBMWs = getCarByBrendAndYearOperational(mass, "BMW", 2);
    System.out.println("BMW старше 2 лет: " + oldBMWs.length);
    Car[] oldAstons = getCarByBrendAndYearOperational(mass, "Aston Martin", 0);
    System.out.println("Aston Martin старше 0 лет: " + oldAstons.length);
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

  public static Car[] getCarByBrendAndYearOperational(Car[] cars, String brend, int years) {

    int cyear = 2025;

    int count = 0;
    for (int i = 0; i < cars.length; i++) {
        int carAge = cyear - cars[i].getYear();
        if (cars[i].getBrand().equals(brend) && carAge > years) {
            count++;
        }
    }

    Car[] result = new Car[count];

    int in = 0;
    for (int i = 0; i < cars.length; i++) {
        int carAge = cyear - cars[i].getYear();
        if (cars[i].getBrand().equals(brend) && carAge > years) {
            result[in] = cars[i];
            in++;
        }
    }
    return result;
  }
}

