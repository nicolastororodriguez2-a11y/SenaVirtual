import javax.swing.*;

public class Calculadora {

   public int sumar(int num1, int num2){
        return num1+num2;
    }
    public int restar(int num1, int num2){
        return  num1-num2;
    }
    public int multiplicar(int num1, int num2){
        return  num1*num2;
    }
    public double dividir(double num1, double num2){
        return  num1/num2;
    }
    public void esMayor(int num1, int num2){
       if (num1==num2){
           JOptionPane.showMessageDialog(null,"Los numeros son igules");
       } else if (num1 > num2) {
           JOptionPane.showMessageDialog(null,"Numero 1 es mayor");
       }else{
           JOptionPane.showMessageDialog(null,"Numero 2 es mayor");
       }


    }

    static void main() {
        Calculadora calculadora =new Calculadora();
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del numero 1: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del numero 2: "));
        //Muestra el resultado en consola
        System.out.println("El resultado de la suma es "+calculadora.sumar(num1,num2));
        //Muestra el resultado en pantalla
        JOptionPane.showMessageDialog(null,"El resultado de la suma es "+calculadora.sumar(num1,num2));
        JOptionPane.showMessageDialog(null,"El resultado de la resta es "+calculadora.restar(num1,num2));
        JOptionPane.showMessageDialog(null,"El resultado de multiplicacion  es "+calculadora.multiplicar(num1,num2));
        JOptionPane.showMessageDialog(null,"El resultado de la divicion es "+calculadora.dividir(num1,num2));

    }
    }
