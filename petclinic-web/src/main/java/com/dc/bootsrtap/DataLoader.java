package com.dc.bootsrtap;

import com.dc.model.Owner;
import com.dc.model.Vet;
import com.dc.services.OwnerService;
import com.dc.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;


    @Autowired
    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }


    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setFname("name1");
        owner1.setLname("surname1");

        Owner owner2 = new Owner();
        owner2.setFname("name2");
        owner2.setLname("surname2");

        ownerService.save(owner1);
        ownerService.save(owner2);

        System.out.println("saved owners");

        Vet vet1 = new Vet();
        vet1.setFname("vetname1");
        vet1.setLname("vetsurname1");

        Vet vet2 = new Vet();
        vet2.setFname("vetname2");
        vet2.setLname("vetsurname2");

        vetService.save(vet1);
        vetService.save(vet2);


        System.out.println("saved vets");





    }
}
