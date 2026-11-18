'# Soru 1 - Üçgen Sınıfı
GeometricObject temelinden türeyen Triangle sınıfı kenarlar, alan ve çevre hesaplamalarını sağlar.
```mermaid
classDiagram
  class GeometricObject {
    -String color
    -boolean filled
    +getColor() String
    +setColor(String) void
    +isFilled() boolean
    +setFilled(boolean) void
  }
  class Triangle {
    -double side1
    -double side2
    -double side3
    +Triangle()
    +Triangle(double,double,double)
    +getSide1() double
    +getSide2() double
    +getSide3() double
    +getArea() double
    +getPerimeter() double
    +toString() String
  }
  GeometricObject <|-- Triangle
```
İki sınıfı derleyip `q1.Main` çalıştırın. Üç kenar, renk ve dolu bilgisi isteyerek sonuçları görüntüler.'