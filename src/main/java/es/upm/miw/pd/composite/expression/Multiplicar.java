package es.upm.miw.pd.composite.expression;

public class Multiplicar extends Operacion {
    
    public Multiplicar(Expresion Exp1, Expresion Exp2){
        super(Exp1,Exp2);
        this.operador = '*';
}
    
    public int operar(){       
       return this.Exp1.operar()*this.Exp2.operar();   
    }
}
