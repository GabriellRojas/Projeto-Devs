package rojas.gabriel.projetodevs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import rojas.gabriel.projetodevs.model.Devs;

import java.util.ArrayList;

@RestController
public class DevsController {

    @GetMapping("/devs")
    public Devs dev() {
        Devs dev = new Devs();

        dev.setName("Gabriel");
        dev.setLastName("Rojas");
        dev.setAge("26");
        dev.setStack("ReactJS, NodeJS");

        return dev;
    }

    @GetMapping("/cadastro")
    public ArrayList<Devs>devs() {

        Devs dev1 = new Devs();

        dev1.setName("Gabriel");
        dev1.setLastName("Rojas");
        dev1.setAge("26");
        dev1.setStack("ReactJS, NodeJS");

        Devs dev2 = new Devs();

        dev2.setName("João");
        dev2.setLastName("Silveira");
        dev2.setAge("20");
        dev2.setStack("HTML, CSS, JavaScript");

        Devs dev3 = new Devs();

        dev3.setName("Natalia");
        dev3.setLastName("Dias");
        dev3.setAge("34");
        dev3.setStack("SpringBoot, Phyton");

        ArrayList<Devs> register = new ArrayList();

        register.add(dev1);
        register.add(dev2);
        register.add(dev3);

        return register;

    }

}
