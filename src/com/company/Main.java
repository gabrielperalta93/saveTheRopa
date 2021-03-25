package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    Prenda nuevaRemera = new Prenda("nike", "remera");
	    Prenda pantalon = new Prenda("adidas", "pantalon");
	    ArrayList<Prenda> prendas = new ArrayList<Prenda>();
	    prendas.add(nuevaRemera);
	    prendas.add(pantalon);
	    GuardaRopa guardaRopa = new GuardaRopa();
	    int numeroNuevo = guardaRopa.guardarPrendas(prendas);
	    System.out.println("Se guardaron las prendas con el numero " + numeroNuevo);

	    guardaRopa.devolverPrendas(numeroNuevo);

    }
}
