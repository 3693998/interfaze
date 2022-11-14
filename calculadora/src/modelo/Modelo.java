/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class Modelo {

    double resultado;
    String operacion;

    public Modelo() {

    }

    public Modelo(double resultado) {
        this.resultado = resultado;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public void sumar(double resultado, double n1) {
        this.resultado = resultado + n1;

    }

    public void restar(double resultado, double n1) {
        this.resultado = resultado - n1;

    }

    public void multiplicar(double resultado, double n1) {
        this.resultado = resultado * n1;

    }

    public void dividir(double resultado, double n1) {
        if (n1 != 0) {
            this.resultado = resultado / n1; 
        }
   
    }
   
    public void borrar(double resultado) {
        this.resultado = 0;
    }

    public void calcula(String operacion, double n1) {

        switch (operacion) {

            case "+":
                sumar(resultado, n1);

                break;

            case "-":
                restar(resultado, n1);

                break;

            case "*":
                multiplicar(resultado, n1);

                break;

            case "/":
                dividir(resultado, n1);

                break;
          }
       
    }

}
