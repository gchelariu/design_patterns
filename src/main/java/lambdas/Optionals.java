package lambdas;

import lambdas.objects.Home;
import lambdas.objects.Pet;

import java.util.Optional;

public class Optionals {

    public static void main(String[] args) {
        Home myHome = new Home();
        myHome.setPet(Pet.builder().build());
//        int nrOfLegs = myHome.getPet().getNrOfLegs();
//        System.out.println(nrOfLegs);
        boolean present = Optional.ofNullable(myHome)
                .map(Home::getPet)
                .map(Pet::getNrOfLegs)
                .isPresent();
        System.out.println(present);


    }
}
