package domain;

import java.util.List;
import java.util.stream.Collectors;

public class Metodos {

    public List<String> chequearDominio(List<String> correos, String dominio){
        return correos.stream()
                .filter(correo -> (correo.contains(dominio)))
                .distinct().collect(Collectors.toList());
    }
    public List<String> chequearFormato(List<String> correos){
        return correos.stream()
                .map(e -> e)
                .filter(e -> (e.contains("@") && e.contains(".com")))
                .collect(Collectors.toList());
    }
}
