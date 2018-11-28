package sabillon.springframework5.sfgpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import sabillon.springframework5.sfgpetclinic.model.Owner;
import sabillon.springframework5.sfgpetclinic.model.Vet;
import sabillon.springframework5.sfgpetclinic.services.OwnerService;
import sabillon.springframework5.sfgpetclinic.services.VetService;

/**
 * The type Data initializer.
 */
@Component
public class DataInitializer implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataInitializer(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        this.initData();
    }

    private void initData() {
        Owner owner1 = new Owner();
        owner1.setFirstName("Miguel");
        owner1.setLastName("Sabillon");

        Owner owner2 = new Owner();
        owner2.setFirstName("Diana");
        owner2.setLastName("Sabillon");

        this.ownerService.save(owner1);
        this.ownerService.save(owner2);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Rossanna");
        vet1.setLastName("Passino");

        Vet vet2 = new Vet();
        vet2.setFirstName("Husky");
        vet2.setLastName("Starcraft");

        this.vetService.save(vet1);
        this.vetService.save(vet2);

        System.out.println("Loaded Vets...");
    }

}
