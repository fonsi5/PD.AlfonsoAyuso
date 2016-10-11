package es.upm.miw.pd.factoryMethod.naturalNumber;

public class NaturalNumberFrCreator extends NaturalNumberCreator{

    @Override
    public NaturalNumber createNumber (int numero) {
        return new NaturalNumberFr(numero);
    }

}