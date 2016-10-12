package es.upm.miw.pd.factoryMethod.naturalNumber;

public class NaturalNumberFr extends NaturalNumber {

    private static final String[] textValue = {"zéro", "un", "dex", "trois", "quatre", "cinq"};
    
    public NaturalNumberFr(int number){
        super(number);
    }
    
    @Override
    public String[] textValue() {
        return textValue;
    }

}