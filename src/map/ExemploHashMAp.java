package map;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMAp {
    public static void main(String[] args) {
        Map<String, Integer> campeoesFifa = new HashMap<>();
        campeoesFifa.put("Brasil", 5);
        campeoesFifa.put("Alemanha", 4);
        campeoesFifa.put("Italia", 4);
        campeoesFifa.put("Uruguai", 2);
        campeoesFifa.put("Argentina", 2);
        campeoesFifa.put("França", 2);
        campeoesFifa.put("Inglaterra", 1);
        campeoesFifa.put("Espanha", 1);

        System.out.println(campeoesFifa);
        campeoesFifa.put("Brasil", 6);
        System.out.println("lista atualizada " + campeoesFifa);
        System.out.println("Retorna valor pela chave "+ campeoesFifa.get("Argentina"));
        System.out.println("Retorna se existe ou não na lista " + campeoesFifa.containsKey("Italia"));
        System.out.println("Remove -> " + campeoesFifa.remove("Espanha"));
        System.out.println("Retorna o tamanho da lista " + campeoesFifa.size());
        System.out.println(campeoesFifa);

        for (Map.Entry<String, Integer> entry : campeoesFifa.entrySet()) {
            System.out.println(entry.getKey() + "--> " + entry.getValue());
        }
    }

}
