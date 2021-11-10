package com.br.orientacaooo.model.dates;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Data {
    public static void main(String[] args) {

        SimpleDateFormat formatTeste01 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formatTeste02 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        formatTeste01.setTimeZone(TimeZone.getTimeZone("GMT"));
        formatTeste02.setTimeZone(TimeZone.getTimeZone("GMT"));

        System.out.println(formatTeste01.format(new Date()));
        System.out.println(formatTeste02.format(new Date()));

        System.out.println(new Date(System.currentTimeMillis()));
        System.out.println(new Date(0L));
        System.out.println(new Date());

    }
}
