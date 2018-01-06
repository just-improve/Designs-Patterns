import PCar.Car;
import PCar.Ferrari;
import PCar.Maluch;
import Player.Player;
import Player.Attacker;
import Player.Goalkeeper;


public class Factory {

    public Car getCar(String car){
        if (car.equalsIgnoreCase("ferrari")){
            return new Ferrari();
        }

        else if (car.equalsIgnoreCase("maluch")){
            return new Maluch();
        }

        return null;
    }

    public Player getPlayer(String position){
        if (position.equalsIgnoreCase("Attacker")){
            return new Attacker();
        }

        else if (position.equalsIgnoreCase("Goalkeeper")){
            return new Goalkeeper();
        }

        return null;
    }
}
