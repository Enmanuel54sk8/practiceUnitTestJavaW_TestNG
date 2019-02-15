import java.util.ArrayList;

public class Calculadora {

    private int ans;

    public int add(int variableX, int variableY){
        return ans = variableX + variableY;
    }

    public ArrayList<String> algoritmoOptimo(){
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Hola");
        arrayList.add("Como");

        if(arrayList.isEmpty()){
            for (String contenido: arrayList){
                arrayList.add("Estas?");
                System.out.println(contenido);
            }
        }
        return arrayList;
    }
}
