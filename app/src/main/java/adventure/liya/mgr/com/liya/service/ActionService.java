package adventure.liya.mgr.com.liya.service;

import adventure.liya.mgr.com.liya.model.Aventure;
import adventure.liya.mgr.com.liya.model.Personnage;

/**
 * Created by mblandin2016 on 06/04/2018.
 */

public class ActionService {

    PersonnageService ps = new PersonnageService();

    public void effetAction(Aventure a, Personnage personnage, int valeurEffet , String effet){
        for(Personnage p : a.getPersonnages()){
            if(p == personnage){
                switch(effet){
                    case "PV":
                        ps.calculerPointVieMagie(p.getPointVie(),personnage.getPointVie(),valeurEffet);
                        break;
                    case "PM":
                        ps.calculerPointVieMagie(p.getPointMagie(),personnage.getPointMagie(),valeurEffet);
                        break;
                }

            }
        }

    }


}
