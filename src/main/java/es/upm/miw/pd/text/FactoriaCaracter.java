package es.upm.miw.pd.text;

import java.util.HashMap;
import java.util.Map;

public class FactoriaCaracter {

    private static FactoriaCaracter CaracterFactory;

    private Map<Character, Caracter> CaractersMap;

    private FactoriaCaracter() {
        CaractersMap = new HashMap<Character, Caracter>();
    }

    public static FactoriaCaracter getFactoria() {
        if (CaracterFactory == null) {
            CaracterFactory = new FactoriaCaracter();
        }
        return CaracterFactory;
    }

    public Caracter get(Character key) {
        if (!CaractersMap.containsKey(key)) {
            CaractersMap.put(key, new Caracter(key));
        }
        return CaractersMap.get(key);
    }
}
