/*
import com.sun.deploy.cache.BaseLocalApplicationProperties;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class testCode {
    public static final int USERINPUT = 2;
    private static Scanner simController;
    private static BaseLocalApplicationProperties lights;

    //creates multiple car objects:                   *************
    public static void main(String[] args){
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < USERINPUT; i++) {
            cars.add(new Car("car_" + i + 1));
        }
        cars.get(0).setSpeed(1);
        for (int object = 0; object < USERINPUT; object++) {
            System.out.printf("%s going:%dseg/s at location:%s%n", cars.get(object).getId(), cars.get(object).getSpeed(), cars.get(object).getPosition());
        }

        List<Road> roads = new ArrayList<>();
        List<TrafficLight> lights = new ArrayList<>();
        int[] car = new int[5];
        roads.add(new Road("1",2,1,car));
        for (int a = 0; a < USERINPUT;a++){
            lights.add(new TrafficLight("123",roads.get(0)));
        }


////Simulation loop: that gets user input for each turn


        System.out.println("Start Simulation?(y)");
        Scanner simController = new Scanner(System.in);
        char answer = simController.next().toLowerCase().charAt(0);
        int turn = 0;
        int carSpawns = simController.nextInt();
        String color = simController.next();
        if (answer == 'y') {
            do {
                turn = turn + 1;
                for (int i = 0; i < carSpawns; i++) {
                    final Car currentCar = cars.get(i);
                    TrafficLight currentLight = lights.get(i);
                    currentLight.operate(i);
                    currentLight.printLightStatus();
                    currentCar.move();
                    currentCar.printCarStatus();
                }
                System.out.println("Sim turn = " + turn + "\nContinue Sim?(y)");
                char answer2 = simController.nextLine().toLowerCase().charAt(0);

            }while (answer == 'y');

        }
    }
}

*/
