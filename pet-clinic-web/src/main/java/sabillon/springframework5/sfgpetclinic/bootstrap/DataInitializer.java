package sabillon.springframework5.sfgpetclinic.bootstrap;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import sabillon.springframework5.sfgpetclinic.model.Owner;
import sabillon.springframework5.sfgpetclinic.model.Pet;
import sabillon.springframework5.sfgpetclinic.model.PetType;
import sabillon.springframework5.sfgpetclinic.model.Speciality;
import sabillon.springframework5.sfgpetclinic.model.Vet;
import sabillon.springframework5.sfgpetclinic.model.Visit;
import sabillon.springframework5.sfgpetclinic.services.OwnerService;
import sabillon.springframework5.sfgpetclinic.services.PetService;
import sabillon.springframework5.sfgpetclinic.services.PetTypeService;
import sabillon.springframework5.sfgpetclinic.services.SpecialityService;
import sabillon.springframework5.sfgpetclinic.services.VetService;
import sabillon.springframework5.sfgpetclinic.services.VisitService;

/**
 * The type Data initializer.
 */
@Component
public class DataInitializer implements CommandLineRunner {

	private final OwnerService ownerService;
	private final VetService vetService;
	private final PetTypeService petTypeService;
	private final PetService petService;
	private final SpecialityService specialityService;
	private final VisitService visitService;

	public DataInitializer(OwnerService ownerService, VetService vetService, PetTypeService petTypeService,
			PetService petService, SpecialityService specialityService, VisitService visitService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petTypeService = petTypeService;
		this.petService = petService;
		this.specialityService = specialityService;
		this.visitService = visitService;
	}

	@Override
	public void run(String... args) throws Exception {
		this.initData();
	}

	private void initData() {

		Speciality sp1 = new Speciality();
		sp1.setDescription("Radiolgy");
		Speciality sp2 = new Speciality();
		sp2.setDescription("Surgery");
		Speciality sp3 = new Speciality();
		sp3.setDescription("Dentistry");

		sp1 = this.specialityService.save(sp1);
		sp2 = this.specialityService.save(sp2);
		sp3 = this.specialityService.save(sp3);

		PetType dog = new PetType();
		dog.setName("Dog");
		dog = this.petTypeService.save(dog);

		PetType cat = new PetType();
		cat.setName("Cat");
		cat = this.petTypeService.save(cat);

		Owner owner1 = new Owner();
		owner1.setFirstName("Miguel");
		owner1.setLastName("Sabillon");
		owner1.setAddress("Madrid Capital");
		owner1.setCity("Madrid");
		owner1.setTelephone("99999999");

		owner1 = this.ownerService.save(owner1);

		Pet pet1 = new Pet();
		pet1.setPetType(dog);
		pet1.setName("Oscar");
		pet1.setBirthDate(LocalDate.now());
		pet1.setOwner(owner1);

		pet1 = this.petService.save(pet1);
		owner1.getPets().add(pet1);
		this.ownerService.save(owner1);

		Owner owner2 = new Owner();
		owner2.setFirstName("Diana");
		owner2.setLastName("Sabillon");
		owner2.setAddress("Madrid Capital");
		owner2.setCity("Madrid");
		owner2.setTelephone("99999999");

		this.ownerService.save(owner2);

		Pet pet2 = new Pet();
		pet2.setPetType(cat);
		pet2.setName("Sherlock");
		pet2.setBirthDate(LocalDate.now());
		pet2.setOwner(owner2);

		pet2 = this.petService.save(pet2);
		owner2.getPets().add(pet2);
		this.ownerService.save(owner2);

		Vet vet1 = new Vet();
		vet1.setFirstName("Rossanna");
		vet1.setLastName("Passino");
		vet1.getSpecialities().add(sp1);

		Vet vet2 = new Vet();
		vet2.setFirstName("Husky");
		vet2.setLastName("Starcraft");
		vet2.getSpecialities().add(sp2);

		this.vetService.save(vet1);
		this.vetService.save(vet2);

		Visit catVisit = new Visit();
		catVisit.setPet(pet1);
		catVisit.setDate(LocalDate.now());
		catVisit.setDescription("Sneezy kitty");

		this.visitService.save(catVisit);
	}

}
