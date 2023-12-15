package main;

public class Airplane {
    private static Airplane airplane;

    private Airplane(){}

    public static Airplane getInstance(){
        if(airplane==null){
            airplane = new Airplane();
        }
        return airplane;
    }

}