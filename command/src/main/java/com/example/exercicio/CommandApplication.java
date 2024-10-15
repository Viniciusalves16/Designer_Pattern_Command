package com.example.exercicio;

import com.example.exercicio.command.bolo.BoloBaunilhaCommand;
import com.example.exercicio.command.bolo.BoloChocolateCommand;
import com.example.exercicio.command.pizza.PizzaCalabresaCommand;
import com.example.exercicio.command.pizza.PizzaMussarelaCommand;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class CommandApplication {

    public static void main(String[] args) {

        SpringApplication.run(CommandApplication.class, args);

        CommandExecuter commandExecuter = new CommandExecuter();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo a cozinha, hoje infelizmente estamos servindo apenas dois pratos: ");

        while (true) {
            System.out.println("Digite qual dos dois você gostaria: ");
            System.out.println("1 - Pizza de Mussarela");
            System.out.println("2 - Pizza de Calabresa");
            System.out.println("3 - Bolo de chocolate");
            System.out.println("4 - Bolo de baunilha");
            System.out.println("0 - Sair");

            int opcaoEscolhida = scanner.nextInt();

            switch (opcaoEscolhida) {
                case 1 -> commandExecuter.CommandExecuter(new PizzaMussarelaCommand());
                case 2 -> commandExecuter.CommandExecuter(new PizzaCalabresaCommand());
                case 3 -> commandExecuter.CommandExecuter(new BoloChocolateCommand());
                case 4 -> commandExecuter.CommandExecuter(new BoloBaunilhaCommand());
                case 0 -> System.exit(0);
                default -> {
                    System.out.println("NÚMERO INVÁLIDO! Tente novamente.");
                }
            }
        }
    }

}
