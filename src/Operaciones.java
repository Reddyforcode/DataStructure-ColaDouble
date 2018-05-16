public class Operaciones {
    public Cola insertarN(Cola C)
    {
        System.out.println("N° de Elementos");
        int nel = Leer.datoInt();
        double d;
        for(int i = 0; i< nel; i++)
        {
            System.out.println("dato "+i+":");
            d = Leer.datoDouble();
            C.insertar(d);
        }
        return C;
    }

    public Cola mostrar(Cola C)
    {
        Cola Caux = new Cola();
        Caux.frente = Caux.fin = C.frente;
        double d;
        while(!C.colaVacia())
        {
            d = C.ver();
            System.out.println(d);
            C.eliminar();
            Caux.insertar(d);
        }
        return Caux;
    }

    public Cola eliminarNeg(Cola C)
    {
        Cola caux = new Cola();
        caux.frente = C.frente;
        caux.fin = C.frente;
        double d;
        while(!C.colaVacia())
        {
            d = C.ver();
            C.eliminar();
            if(d >= 0)  caux.insertar(d);
        }
        return caux;
    }
    
    public Cola mayorNegativos(Cola C)
    {
    	Cola Caux = new Cola();
        Caux.frente = Caux.fin = C.frente;
        double d;
        
        double mayorNeg = 99999;
        while(!C.colaVacia())
        {
            d = C.ver();
            if((d<0)&&(d<mayorNeg))
            {
            	mayorNeg = d;
            }
            C.eliminar();
            Caux.insertar(d);
        }
        
        if(mayorNeg == 99999){
        	System.out.println("No existe un valor negativo en la Cola");
        }else{
        	System.out.println("El mayor DATO NEGATIVO ES: "+mayorNeg);
        }
        return Caux;
    }
    
    public Cola eliminarPositivos(Cola C)
    {
    	Cola Caux = new Cola();
        Caux.frente = Caux.fin = C.frente;
        double d;
        while(!C.colaVacia())
        {
            d = C.ver();
            
            C.eliminar();
            if(d<0)	Caux.insertar(d);
        }
        return Caux;
    }
    
    public Cola insertarFrente(Cola C)
    {
    	System.out.println("Ingrese el dato a insertar en el Frente:");
    	double dato = Leer.datoDouble();
    	   
    	Cola Caux = new Cola();
        Caux.frente = Caux.fin = C.frente;
        double d;
        Caux.insertar(dato);
        while(!C.colaVacia())
        {
            d = C.ver();  
            C.eliminar();
            Caux.insertar(d);
        }
        return Caux;
    }
    
    public Cola eliminarFinal(Cola C)
    {
    	Cola Caux = new Cola();
        Caux.frente = Caux.fin = C.frente;
        double d;
        while(!C.colaVacia())
        {
            d = C.ver();
            
            C.eliminar();
            if(C.frente != C.fin) Caux.insertar(d);
        }
        return Caux;
    }
}

