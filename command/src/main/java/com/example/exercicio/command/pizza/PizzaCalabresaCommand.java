package com.example.exercicio.command.pizza;

import com.example.exercicio.Command;
import com.example.exercicio.service.PizzaService;

public class PizzaCalabresaCommand implements Command {
    @Override
    public void execute() {
        System.out.println("        ____");
        System.out.println("      /      \\");
        System.out.println("     /  🍕🍕   \\");
        System.out.println("    |   🍅🍄🍕   |");
        System.out.println("     \\        /");
        System.out.println("      \\______/  ");
        System.out.println("      |      |   ");
        System.out.println("      |______|   ");
        PizzaService pizzaService = new PizzaService();
        pizzaService.pizzaCalabresa();
    }
}
