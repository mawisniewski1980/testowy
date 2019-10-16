package pl.probny.test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8 {

    public static void main(String[] args) {


        List<Map> lista = new ArrayList<>();
        /*List<String> lista2 = new ArrayList<>(Arrays.asList("1", "2", "3", "4"));
        List<String> lista3 = new ArrayList<>();*/
        Map<String, Object> mapa = new HashMap<>();
        Map<String, Object> mapa2 = new HashMap<>();
        Map<String, Object> mapa3 = new HashMap<>();

        mapa.put("1", "value1Mapa1");
        mapa.put("2", "value2Mapa1");
        mapa2.put("1", "value1Mapa2");
        mapa2.put("2", "value2Mapa2");
        mapa3.put("1", "value1Mapa3");

        lista.add(mapa);
        lista.add(mapa2);
        lista.add(mapa3);

        System.out.println(lista);
/*        System.out.println(lista2);

        lista3.addAll(lista2.stream().map(idx -> idx+"1").collect(Collectors.toList()));
        System.out.println(lista3);
        System.out.println("------------------------------------------------------------------------");

        Optional optional = lista2.stream().filter(idx -> idx.equalsIgnoreCase("2")).distinct().findAny();
        if(optional.isPresent())
            System.out.println(optional.get());
        else
            System.out.println("[0]");

        System.out.println("------------------------------------------------------------------------");

        Optional optional2 = mapa.entrySet().stream().filter(key->"1".equalsIgnoreCase(key.getKey())).findAny();
        if(optional2.isPresent()) {
            System.out.println(mapa.entrySet().stream().filter(key->"1".equalsIgnoreCase(key.getKey())).findAny().get().getValue());
        } else
            System.out.println("[0]");

        System.out.println("------------------------------------------------------------------------");
        String result = mapa.entrySet().stream().filter(key->"1".equalsIgnoreCase(key.getKey())).findAny().get().getValue().toString();
        if(result != null)
            System.out.println(result);
        else
            System.out.println("[0]");
        */
        System.out.println("------------------------------------------------------------------------");
/*

        lista.forEach(map -> {
            System.out.println(((Map) map).get("1").toString());
        });
        System.out.println("------------------------------------------------------------------------");
*/
        Object xx = lista.stream().map(map-> map.keySet().stream()).collect(Collectors.toList());
        System.out.println(xx.toString());

        ;
    /*    String result = mapa.entrySet().stream()
                .filter(x -> "something".equals(x.getValue()))
                .map(x->x.getValue())
                .collect(Collectors.joining())*/
    }

}
