package es.upm.miw.pd.factoryMethod.naturalNumber;

public class NaturalNumberEnCreator extends NaturalNumberCreator{

    @Override
    public NaturalNumber createNumber (int numero) {
        return new NaturalNumberEn(numero);
    }

}
