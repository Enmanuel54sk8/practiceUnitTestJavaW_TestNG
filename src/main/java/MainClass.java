import java.util.ArrayList;
import java.util.ConcurrentModificationException;

public class MainClass {
    public static void main(String[] args) {
        ArrayList<String> arrayList = bucleInfinito();
        System.out.println(arrayList);
    }

    public static ArrayList<String> bucleInfinito() {
        ArrayList<String> arrayList = new ArrayList();

        arrayList.add("Hola");
        arrayList.add("Como");


        if (!arrayList.isEmpty()) {
            for (String contenido : arrayList) {
                arrayList.add("Estas!!!!");
                System.out.println(contenido);
            }
        } else {
            throw new ConcurrentModificationException("Se lleno la memoria pana!");
        }

        return arrayList;
    }
}
