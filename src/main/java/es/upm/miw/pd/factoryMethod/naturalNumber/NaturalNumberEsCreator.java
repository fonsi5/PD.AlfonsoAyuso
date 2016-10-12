package es.upm.miw.pd.factoryMethod.naturalNumber;

public class NaturalNumberEsCreator extends NaturalNumberCreator{

    @Override
    public NaturalNumber createNumber (int numero) {
        return new NaturalNumberEs(numero);
    }

}
