package com.suranartn.pizza;

import com.suranartn.pizza.config.PizzaConfig;
import com.suranartn.quickstart.QuickstartApplication;
import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log
public class PizzaApplication implements CommandLineRunner {
    final PizzaConfig pizzaConfig;

    public PizzaApplication(PizzaConfig pizzaConfig) {
        this.pizzaConfig = pizzaConfig;
    }

    public static void main(String[] args) {
        SpringApplication.run(PizzaApplication.class, args);
    }

    @Override
    public void run(final String... args) {
        log.info(
                String.format("I want a %s crust pizza, with %s and %s sauce",
                pizzaConfig.getCrust(),
                pizzaConfig.getTopping(),
                pizzaConfig.getSauce()
        ));
    }
}



