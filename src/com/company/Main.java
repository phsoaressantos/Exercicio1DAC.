package com.company;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Calendar;


public class Main {
    public static void main(String[] args) throws UnknownHostException {
        //pegamos o ip da maquina.
        String ipDaMaquina = InetAddress.getLocalHost().getHostAddress();
        System.out.println(ipDaMaquina);
        //nome da maquina.
        String nomeDaMaquina = InetAddress.getLocalHost().getHostName();
        System.out.println(nomeDaMaquina);
        String teste = "Agora que são elas";
        System.out.println(teste);

    }

}




