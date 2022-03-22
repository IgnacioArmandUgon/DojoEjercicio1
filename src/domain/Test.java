package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Test {
    public static void main(String[] args) {
        List<String> correos = new ArrayList<>();
        Metodos metodos = new Metodos();

        correos.add("correo1@gmail.com");
        correos.add("correo2@gmail.com");
        correos.add("correo3@gmail.com");
        correos.add("correo4@gmail.com");
        correos.add("correo5@gmail.com");
        correos.add("correo6@gmail.com");
        correos.add("correo7@gmail.com");
        correos.add("correo8@gmail.com");
        correos.add("correo9@gmail.com");
        correos.add("correo10@gmail.com");
        correos.add("correo11@hotmail.com");
        correos.add("correo12@hotmail.com");
        correos.add("correo13@hotmail.com");
        correos.add("correo14@hotmail.com");
        correos.add("correo15@hotmail.com");
        correos.add("correo16@hotmail.com");
        correos.add("correo17@hotmail.com");
        correos.add("correo18@hotmail.com");
        correos.add("correo19@hotmail.com");
        correos.add("correo20@hotmail.com");
        correos.add("correo21@outlook.com");
        correos.add("correo22@outlook.com");
        correos.add("correo23@outlook.com");
        correos.add("correo24@outlook.com");
        correos.add("correo25@outlook.com");
        correos.add("correo26@outlook.com");
        correos.add("correo27@outlook.com");
        correos.add("correo28@outlook.com");
        correos.add("correo29@outlook.com");
        correos.add("correo30@outlook.com");
        correos.add("correo31@outlook.com");
        correos.add("correo32@outlook.com");

        //Eliminar repetidos
        List<String> correosSinRepetidos = correos.stream()
                .distinct()
                .collect(Collectors.toList());

        //Filtrar los que tienen dominio gmail
        List<String> correosgmail =metodos.chequearDominio(correos, "@gmail");

        //Filtrar los que tienen dominio hotmail
        List<String> correosHotmail= metodos.chequearDominio(correos, "@hotmail");

        //Filtrar los que tienen dominio outlook
        List<String> correosOutlook = metodos.chequearDominio(correos, "@outlook");

        //Imprimir tamaño
        int tamaño = correos.size();

        //Correos con formato correcto
        List<String> correosCorrectos = metodos.chequearFormato(correos);
    }


}
