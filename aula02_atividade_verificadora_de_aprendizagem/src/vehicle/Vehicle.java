package vehicle;

//Classe para representar um veículo
public class Vehicle {
 private String type;
 private String engine;
 private String wheels;
 private String body;

 public Vehicle(String type) {
     this.type = type;
 }

 public void setEngine(String engine) {
     this.engine = engine;
 }

 public void setWheels(String wheels) {
     this.wheels = wheels;
 }

 public void setBody(String body) {
     this.body = body;
 }

 @Override
 public String toString() {
     return "Tipo: " + type + "\nMotor: " + engine + "\nRodas: " + wheels + "\nCarroceria: " + body;
 }
}
