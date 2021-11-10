package com.br.orientacaooo.model.dates;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Calendario {
    public static void main(String[] args) throws ParseException {

        DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Calendar data = new GregorianCalendar();
        data.setTime(sdf.parse("23/07/1986 23:55:05"));

        System.out.println(data.get(Calendar.YEAR));
        System.out.println(data.get(Calendar.MONTH)+1);
        System.out.println(data.get(Calendar.DAY_OF_MONTH));
        System.out.println(data.get(Calendar.HOUR));
        System.out.println(data.get(Calendar.MINUTE));
        System.out.println(data.get(Calendar.SECOND));

    }
}
