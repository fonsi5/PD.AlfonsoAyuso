package es.upm.miw.pd.factoryMethod.naturalNumber;

public class NaturalNumberManager {
    
    private NaturalNumber naturalNumber;

    private NaturalNumberCreator creator;


    public void setCreator(NaturalNumberCreator creator) {
        this.creator = creator;
    }
    
    public void CreateNumber(int number){
        this.naturalNumber=this.creator.createNumber(number);
    }    

    public NaturalNumber getNaturalNumber() {
        return naturalNumber;
    }
    
}
