public class tabla_dispersa {
    static final double R=0.618034;
    static final int TAMTABLA=101;
    private int numElementos;
    private double factorCarga;
    private casarural [] tabla;

    //Inicializacion
    public tabla_dispersa(){
        tabla=new casarural[TAMTABLA];
        for(int j =0;j<TAMTABLA;j++){
            tabla[j]=null;
            numElementos=0;
            factorCarga=0.0;
        }

    }

    //Posicion de un elemento por exploracion cuadratica
    public int direccion(String clave){
        int i=0,p;
        long d;
        d=transformarClaves(clave);
        p=(int)(d%TAMTABLA);
        while (tabla[p]!=null && !tabla[p].elCodigo().equals(clave)){
            i++;
            p=p+i*i;
            p=p%TAMTABLA;
        }
        return p;
    }
    static long transformarClaves(String clave){
        long d;
        d=0;
        for(int j=0;j<Math.min(clave.length(),10);j++){
            d=d*27+(int)clave.charAt(j);
        }
        if(d<0)d=-d;
        return d;
    }

    //Insercion de un elemento
    public void insertar(casarural r){
        int posicion;
        posicion = direccion(r.elCodigo());
        tabla[posicion]=r;
        numElementos++;
        factorCarga=(double)numElementos/TAMTABLA;
        if(factorCarga>0.5){
            System.out.println("\n Factor de carga supera el 50%, Conviene aumentar el tamaño");
        }
    }

    //Busueda de un elemento
    public casarural buscar(String clave){
        casarural pr;
        int posicion;
        posicion=direccion(clave);
        pr=tabla[posicion];
        if(pr!=null)
            if(!pr.esAlta)pr=null;
        return pr;
    }

    //Dar de baja un elemento
    public void eleminar(String clave){
        int posicion;
        posicion=direccion(clave);
        if(tabla[posicion]!=null)
            tabla[posicion].esAlta=false;
    }

   


}
