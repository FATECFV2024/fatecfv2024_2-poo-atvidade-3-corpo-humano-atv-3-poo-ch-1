package main.java;

import java.lang.reflect.Constructor;
import java.lang.reflect.GenericSignatureFormatError;
import java.lang.reflect.Method;

public class CorpoHumano {

    //Declaração de classes
    private double altura;
    private int massa;
    private double volume;
    private int densidade;


    //CONSTRUCTOR
        public CorpoHumano(int massa, double volume, int densidade, double altura){
        this.massa = massa;
        this.altura = altura;
    }

    //Método Calcular IMC
    public double calcularIMC() {
        double alturaEmMetros = altura / 100.0;
        return massa / (alturaEmMetros * alturaEmMetros);
    }

    //GETTERS
        public int getMassa() {
            return this.massa;
        }

        public double getAltura() {
            return this.altura;
        }

        public double getVolume(){
            return this.volume;
        }

        public int getDensidade(){
            return this.densidade;
        }

    // SETTERS
        public void setMassa(int massa) {
            this.massa = massa;
        }
        public void setAltura(double altura) {
            this.altura = altura;
        }
        public void setDensidade(int densidade){
            this.densidade = densidade;
        }
        public void setVolume(double volume){
            this.volume = volume;
        }
    }
        