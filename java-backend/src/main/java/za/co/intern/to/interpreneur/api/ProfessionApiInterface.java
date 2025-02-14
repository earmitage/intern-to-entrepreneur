package za.co.intern.to.interpreneur.api;

import java.util.List;

import za.co.intern.to.interpreneur.domain.Profession;

public interface ProfessionApiInterface {
    
    public Profession createProfession(Profession profession);

    public Profession fetchProfession( String uuid);
  
    public Profession updateProfession(Profession profession);

    public List<Profession> fetchProfessions();
}
