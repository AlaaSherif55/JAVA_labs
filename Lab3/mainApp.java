package mainapp;

import converter.TemperatureConverter;

class MainApp {
    public static void main(String[] args) {
       TemperatureConverter temp=new TemperatureConverter();
       System.out.println("The result: "+temp.apply(15.0));
    }
}
