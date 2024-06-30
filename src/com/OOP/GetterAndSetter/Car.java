package com.OOP.GetterAndSetter;

public class Car {
    private String color;
    private String model;
    private double fuelLevel;
    private long costOfPurchase;

    public Car(String color, String model, double fuelLevel, long costOfPurchase) {
        this.color = color;
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.costOfPurchase = costOfPurchase;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", fuelLevel=" + fuelLevel +
                ", costOfPurchase=" + costOfPurchase +
                '}';
    }

    public String getColor() {
        return color;
    }


    //if you want set your color manually then you can set using setter method. if you will make the
    // method as private as,  you won't be able to set your color. only (Public , Default allows)
    // one more benefits is that if you don't, like yellow color then you can restrict user to set
    //yellow color in your car object. so that they won't be able to set car color as "Yellow".
    //  public void setColor(String color){
    //  if (color.equals("Yellow")){
    //      sout("Pagal hai kya");
    //  }else{
    //        this.color= color;
    //   }
    public void setColor(String color) {
        this.color = color;

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

//  public String setModel(String model){
//    return model;
//
//  }

//    public void setModel(String model){
//        System.out.println(model);
//    }


