package ru.itsjava.services;

import ru.itsjava.domain.Antiques;

public interface AntiquesService {
    Antiques buyAntiquesByName (String name);

    void sellAntiques (Antiques antiques);

    boolean hasAntiques (String name);

    void printAntiques();
}
