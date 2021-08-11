package ru.itsjava.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.itsjava.domain.Antiques;

import java.util.*;

public class AntiquesServiceImplTest {
    List<Antiques> antiques = new ArrayList<>();


    @DisplayName("Проверка метода buyAntiquesByName")
    @Test
    public void checkingBuyAntiquesByNameMethod() {

        Antiques expectedAntiques = new Antiques("Мона_Лиза_(копия)", "Леонардо Да Винчи");
        antiques.add(expectedAntiques);

        AntiquesServiceImpl service = new AntiquesServiceImpl(antiques);
        Assertions.assertEquals(expectedAntiques, service.buyAntiquesByName("Мона_Лиза_(копия)"));
    }

    @DisplayName("Проверка метода sellAntiques")
    @Test
    public void checkingSellAntiquesMethod() {

        Antiques expectedAntiques1 = new Antiques("Мона_Лиза_(копия)", "Леонардо Да Винчи");
        Antiques expectedAntiques2 = new Antiques("Девятый_вал", "Айвазовский");
        antiques.add(expectedAntiques1);
        antiques.add(expectedAntiques2);

        Assertions.assertEquals(expectedAntiques1, antiques.get(0));
        Assertions.assertEquals(expectedAntiques2, antiques.get(1));
    }

    @DisplayName("Проверка метода hasAntiques")
    @Test
    public void checkingHasAntiquesMethod() {

        Antiques expectedAntiques = new Antiques("Мона_Лиза_(копия)", "Леонардо Да Винчи");
        antiques.add(expectedAntiques);

        Assertions.assertTrue(antiques.contains(expectedAntiques));
    }

    @DisplayName("Проверка метода printAntiques")
    @Test
    public void checkingPrintAntiquesMethod() {

        Antiques expectedAntiques = new Antiques("Мона_Лиза_(копия)", "Леонардо Да Винчи");
        antiques.add(expectedAntiques);


        Assertions.assertEquals(expectedAntiques, antiques.get(0));

    }
}
