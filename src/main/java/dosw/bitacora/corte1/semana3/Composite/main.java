package dosw.bitacora.corte1.semana3.Composite;

import dosw.bitacora.corte1.semana3.Composite.Item.*;

public class main {

    public static void main(String[] args) {

        Producto laptop = new Producto("Laptop", 1200);
        Producto mouse = new Producto("Mouse", 40);
        Producto keyboard = new Producto("Keyboard", 80);

        Caja accessoriesBox = new Caja("Accessories Box");
        accessoriesBox.add(mouse);
        accessoriesBox.add(keyboard);

        Caja mainBox = new Caja("Main Box");
        mainBox.add(laptop);
        mainBox.add(accessoriesBox);

        System.out.println("Total price: $" + mainBox.getPrice());
    }
}
