import javax.swing.*;

public class Ciclos {
    static void main() {
        var saldo =100000;
        var salir=true;
        while (salir){
            int opcion=Integer.parseInt(JOptionPane.showInputDialog("1.Consultar saldo || 2.depositar dinero || 3.retirar dinero || 4.salir\n Escoge una opcion  "));
            switch (opcion){
                case 1:
                    JOptionPane.showMessageDialog(null,"Su saldo es de "+ saldo);
                    break;
                case 2:
                    var depositar =Integer.parseInt(JOptionPane.showInputDialog("Digite cuanto dinero desea depositar "));
                    if (depositar<=0){
                        JOptionPane.showMessageDialog(null,"Error");
                    }
                    else {
                        saldo += depositar;
                        JOptionPane.showMessageDialog(null,"Deposito exitoso");
                    }
                    break;
                case 3:
                    var retirar=Integer.parseInt(JOptionPane.showInputDialog("Digite cuanto desea retirar "));
                    if (retirar>saldo){
                        JOptionPane.showMessageDialog(null,"Saldo insuficiente" );
                    }
                    else {
                        saldo-=retirar;
                        JOptionPane.showMessageDialog(null,"Retiro exitoso ");
                    }
                    break;
                case 4:
                    salir=false;
                    JOptionPane.showMessageDialog(null,"Gracias por utilizar nuestro cajero...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opcion incorrecta");
            }
        }
    }
}