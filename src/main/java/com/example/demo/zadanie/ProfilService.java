package com.example.demo.zadanie;

import com.example.demo.crud.Osoba;

import java.util.*;

public class ProfilService {

    private Map<Integer, Profil> repo = new HashMap<>();

    private int getNewId() {
        return new Random().nextInt();
    }

    public Profil create(Profil nowy) {
        nowy.setId(getNewId());
        repo.put(nowy.getId(), nowy);
        return nowy;
    }

    public List<Profil> list() {
        return new ArrayList<>(repo.values());
    }

    public Profil get(Integer id) {
        return repo.get(id);
    }

    public Profil update(Profil toUpdate) {
        if (repo.containsKey(toUpdate.getId())) {
            repo.put(toUpdate.getId(), toUpdate);
            return toUpdate;
        }
        return null;
    }
    public void delete(int id) {
        repo.remove(id);
    }


}