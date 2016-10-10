package es.upm.miw.pd.composite.expression;

public abstract class Operacion extends Expresion {
    
   protected Expresion Exp1;
   protected Expresion Exp2;
   protected char operador;
   
   public Operacion (Expresion Exp1, Expresion Exp2){
       this.Exp1 = Exp1;
       this.Exp2 = Exp2;       
   }

   public String toString(){
       return "("+Exp1+operador+Exp2+")";
       
   }
   
}
