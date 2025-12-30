package com.example.demo.scheduleds;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class MyScheduling {

    private int count = 1;


    //1s = 1000ms

//    @Scheduled(fixedRate = 5000)// каждые 5 сек выполняет данный метод
//    public void executeFixedRate() throws InterruptedException { // отсчет начинается ОТ НАЧАЛА предыдущего выполнения
//        System.out.println("Hello : " + count++);
//    }

//    @Scheduled(fixedDelay = 5000)// каждые 5 сек выполняет данный метод
//    public void executeFixedDelay() throws InterruptedException { // отсчет начинается ОТ КОНЦА предыдущего выполнения
//        System.out.println("Bye   : " + count--);
//    }

//    @Scheduled(fixedRate = 5000,initialDelay = 60_000)// каждые 5 сек выполняет данный метод
//    public void executeFixedRate() throws InterruptedException { // отсчет начинается ОТ НАЧАЛА предыдущего выполнения
//        System.out.println("Hello : " + count++);
//    }

//
//
//
//        _________________________________________________ секунда       (0-59)
//       |     ____________________________________________ минута        (0-59)
//       |    |     _______________________________________ час           (0-23)
//       |    |    |     __________________________________ день месяаца  (1-31)
//       |    |    |    |     _____________________________ месяац        (1-12)
//       |    |    |    |    |     ________________________ день недели   (1-7)
//       |    |    |    |    |    |
//       |    |    |    |    |    |
//       *    *    *    *    *    *


//    *                -  любое
//    */x              -  каждые Х единиц
//    -                -  диапазон
//    ,                -  несколько значений
//    L                -  последний день месяца
//    W                -  ближайший рабочий день к 15 числу
//    SUN-MON(1-3)     -
//    2#2              - вторая неделя вторник

//    @Scheduled(cron = "* * * * * *")  kajduyu sekundu
//    @Scheduled(cron = "45 * * * * *")
//    @Scheduled(cron = "* 0 * * * *")
//    @Scheduled(cron = "*/10 2 * * * *")
//    @Scheduled(cron = "0 6 9 * * *") //  * 45 10 * * *         10:45
//    @Scheduled(cron = "0 */9 9 * * *") //  18:09  18:18  18:27  18:36  18:45  18:54
//    @Scheduled(cron = "0 0 9,18 1-10 1,2,12 *") //  09:00 18:00
//    @Scheduled(cron = "0 15 9,18 * * 1-5") //  09:00 18:00
//    @Scheduled(cron = "0 15 9 L * *") //  09:00 18:00
//    @Scheduled(cron = "0 15 9 * * 2#3") //  09:00 18:00
    @Scheduled(cron = "${my.task.cron}") //  09:00 18:00
    public void executeQrafik(){
        System.out.println("Hello : " + count++);
    }
//    Задача 1: Система напоминаний сотрудникам
//    Создайте метод sendEmployeeReminders(),
//    который должен выполняться:
//
//    Каждый рабочий день (понедельник-пятница)
//    В 9:00, 14:00 и 17:30
//    НО НЕ выполняться 1-го числа каждого месяца (день отчетности)


    @Scheduled(cron = "${send.morning.reminder}")
    public void sendMorningReminder(){
        sendEmployeeReminder(" Утреннее напоминание 17:30 ");
    }

    @Scheduled(cron = "${send.afternoon.reminder}")
    public void sendAfternoonReminder(){
        sendEmployeeReminder(" Дневное напоминание 17:30 ");
    }

    @Scheduled(cron = "${send.evening.reminder}")
    public void sendEveningReminder(){
        sendEmployeeReminder(" Вечернее напоминание 17:30 ");
    }

    public void sendEmployeeReminder(String remaindType){
        LocalDate n =  LocalDate.now();
        System.out.println(remaindType + " : " + n.toString());
    }







    // 13:00:05  (x sec)
    // 13:00:10
    // 13:00:15
    // 13:00:20
    // 13:00:25
    // 13:00:30
}
