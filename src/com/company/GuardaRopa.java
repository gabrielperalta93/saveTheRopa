package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRopa {
    private int contador;
    private HashMap<Integer, ArrayList<Prenda>> diccionario;

    public GuardaRopa(){
        this.contador = 0;
        diccionario = new HashMap<>();
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public HashMap<Integer, ArrayList<Prenda>> getDiccionario() {
        return diccionario;
    }

    public void setDiccionario(HashMap<Integer, ArrayList<Prenda>> diccionario) {
        this.diccionario = diccionario;
    }

    public GuardaRopa(int contador, HashMap<Integer, ArrayList<Prenda>> diccionario) {
        this.contador = contador;
        this.diccionario = diccionario;
    }

    public Integer guardarPrendas(ArrayList<Prenda> listaDePrenda){
        this.contador++;
        this.diccionario.put(this.contador, listaDePrenda);
        return this.contador;
    }

    public void mostrarPrendas(){
        for (Map.Entry<Integer, ArrayList<Prenda>> entry : diccionario.entrySet()) {
            ArrayList<Prenda> prendas = entry.getValue();
            System.out.println("La clave es " + entry.getKey());
            for(Prenda p : prendas){
                System.out.println("Prenda es marca: " + p.getMarca() + " modelo: " + p.getModelo());
            }
        }
    }

    public List<Prenda> devolverPrendas(Integer numero){
        ArrayList<Prenda> nuevasPrendas = new ArrayList<Prenda>();
        nuevasPrendas = diccionario.get(numero);
        for(Prenda p : nuevasPrendas){
            System.out.println("Las prendas del numero " + numero + " es " + p.getModelo() + p.getMarca());
        }
        return nuevasPrendas;
    }
}
