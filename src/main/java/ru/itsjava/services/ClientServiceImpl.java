package ru.itsjava.services;

import lombok.RequiredArgsConstructor;
import ru.itsjava.domain.Antiques;
import ru.itsjava.domain.Client;

import java.util.Scanner;

@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService{
    private final Client client;
    private final Scanner scanner;
    private final AntiquesService antiquesService;

    @Override
    public void buyAntiques() {
        System.out.println("Введите название антиквариата");
        String name = scanner.next();
        if (antiquesService.hasAntiques(name)){
            System.out.println("Покупаем антиквариат ...");
            antiquesService.buyAntiquesByName(name);
            System.out.println("Купили антиквариат " + name);
        }else {
            System.out.println("Не смогли купить антиквариат ... Такого наименования нет :(");
        }
    }

    @Override
    public void sellAntiques() {
        System.out.println("Введите название антиквариата");
        String name = scanner.next();

        System.out.println("Введите автора антиквариата");
        String author = scanner.next();

        Antiques antiques = new Antiques(name, author);
        antiquesService.sellAntiques(antiques);

    }

    @Override
    public void printAntiques() {
        System.out.println("Уважаемый " + client.getName());
        System.out.println("Вот наш антиквариат: ");
        antiquesService.printAntiques();
    }
}
