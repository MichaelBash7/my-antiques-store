package ru.itsjava.services;

import lombok.RequiredArgsConstructor;
import ru.itsjava.domain.Antiques;

import java.util.List;

@RequiredArgsConstructor
public class AntiquesServiceImpl implements AntiquesService {
    private final List<Antiques> antiquesFromStore;


    @Override
    public Antiques buyAntiquesByName (String name) {
        Antiques resAntiques = null;
        for (Antiques antiques : antiquesFromStore){
            if (antiques.getName().equals(name)){
                resAntiques = antiques;
            }
        }
        if (resAntiques != null) {
            antiquesFromStore.remove(resAntiques);
            return resAntiques;
        }
        return null;
    }

    @Override
    public void sellAntiques(Antiques antiques) {
        antiquesFromStore.add(antiques);
    }

    @Override
    public boolean hasAntiques(String name) {
        for (Antiques antiques : antiquesFromStore){
            if (antiques.getName().equals(name)){
                return true;
            }
        }
        return false;
    }

    @Override
    public void printAntiques() {
        for (Antiques antiques : antiquesFromStore){
            System.out.println(antiques.getName() + " " + antiques.getAuthor());
        }
    }
}
