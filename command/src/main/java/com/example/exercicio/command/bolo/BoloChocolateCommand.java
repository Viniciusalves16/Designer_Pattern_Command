package com.example.exercicio.command.bolo;

import com.example.exercicio.Command;
import com.example.exercicio.service.BoloService;

public class BoloChocolateCommand implements Command {

    @Override
    public void execute() {
        BoloService boloService = new BoloService();

        System.out.println("       ,   ,   ,");
        System.out.println("      |\\  |\\  |\\");
        System.out.println("      | \\_| \\_| \\_");
        System.out.println("      |   |   |   |");
        System.out.println("      |~~~|~~~|~~~|");
        System.out.println("      |   |   |   |");
        System.out.println("      |~~~|~~~|~~~|");
        System.out.println("      |   |   |   |");
        System.out.println("      |~~~|~~~|~~~|");
        System.out.println("      |   |   |   |");
        System.out.println("      |~~~|~~~|~~~|");
        System.out.println("      '---'---'---'");

        boloService.boloChocolate();
    }
}
