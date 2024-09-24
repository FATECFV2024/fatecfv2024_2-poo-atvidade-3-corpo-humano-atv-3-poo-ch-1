package main.java;

import java.lang.reflect.Constructor;
import java.lang.reflect.GenericSignatureFormatError;
import java.lang.reflect.Method;

public class CorpoHumano {

    private int idade;
    private int altura;
    private String sexo;
    private int massa;
    private int volume;
    private int densidade;
    private boolean isAdult;

    //CONSTRUCTOR
    public CorpoHumano(int peso, int idade, int altura){
        this.massa = peso;
        this.idade = idade;
        this.altura = altura;
        if(idade > 18){
            isAdult = true;
        } else {
            isAdult = false;
        }
    }

    public double calcularImc() {
        double alturaEmMetros = altura / 100.0;
        return massa / (alturaEmMetros * alturaEmMetros);
    }
    //GETTERS
        public int getPeso() {
            return this.idade;
        }
        
        public int getIdade() {
            return this.massa;
        }

        public int getAltura() {
            return this.altura;
        }

        public int getVolume(){
            return this.volume;
        }

        public boolean getIsAdult(){
            return this.isAdult;
        }

        public String getSexo(){
            return this.sexo;
        }

        public int getDensidade(){
            return this.densidade;
        }

    // SETTERS
        public void setPeso(int peso) {
            this.massa = peso;
        }

        public void setAltura(int altura) {
            this.altura = altura;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }

        public void display() {
            System.out.println("Peso: " + massa + " kg");
            System.out.println("Idade: " + idade + " anos");
            System.out.println("Altura: " + altura + " cm");
            System.out.println("É adulto: " + isAdult);
            System.out.printf("IMC: %.2f\n", calcularImc());
        }
    }


