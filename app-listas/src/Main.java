import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marco");


        for(String obj : list){
            System.out.println(obj);
        }

        //list.remove(1);
        //list.remove("Anna");
        list.removeIf( obj -> obj.charAt(0) == 'M'); // pega o valor x que é do tipo string
        // e me retorna se esse x.chart(0) é == a M

        System.out.println(list.size());

        System.out.println("--------------------------------");

        List<String> result = list.stream().filter(obj -> obj.charAt(0) == 'A').collect(Collectors.toList()); /*
        uma lista de resultados, onde está filtrando um obj que começa com a letra 'a'
        permite que eu faça operações lambda com o tipo list
        primeiro converto para string, faço a operação lambda que eu quero e depois volto para uma lista
        */

        System.out.println(result);

        System.out.println("-----------------------------------------");
        String name = list.stream().filter(obj -> obj.charAt(0) == 'J').findFirst().orElse(null); /* caso ele não
        encontre, ele me retorna um null
        */
        System.out.println(name);
    }
}