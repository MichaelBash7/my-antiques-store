package ru.itsjava.services;

import ru.itsjava.domain.Antiques;
import ru.itsjava.domain.Client;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StoreServiceImpl implements StoreService{

    @Override
    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваше ФИО");
        String clientName = scanner.next();

        Client client = new Client(clientName , new ArrayList<>());

        List<Antiques> antiquesList = new ArrayList<>();

                antiquesList.add(new Antiques("Девятый_вал", "Айвазовский"));
                antiquesList.add(new Antiques("Статуя_Давида", "Микеланджело"));
                antiquesList.add(new Antiques("Шкатулка 18го века", "Неизвестный автор"));

        AntiquesService antiquesService = new AntiquesServiceImpl(antiquesList);

        ClientService clientService = new ClientServiceImpl(client, scanner, antiquesService);

        MenuService menuService = new MenuServiceImpl(clientService, scanner);

        menuService.menu();

        }
    }

