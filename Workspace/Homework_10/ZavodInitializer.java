package Homework_10;

import Homework_10.employee.Director;
import Homework_10.employee.Worker;
import utils.ArraysUtils;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashSet;

public class ZavodInitializer {
    public static void main(String[] args) {
        Worker petyaRabotyaga = new Worker("Петя", "Работяга", Position.WORKER, LocalDate.parse("2020-03-20"));
        Worker ivanTolkoChtoPriwel = new Worker("Ваня", "Толькочтопришел", Position.WORKER);
        Worker jenya3minutesToPensia = new Worker("Женя", "Триминутыдопенсии", Position.WORKER, LocalDate.parse("1976-12-21"));

        Director joskiyGlavaZavoda = new Director("Жоский", "Главазавода",
                Position.DIRECTOR, LocalDate.parse("2000-03-14"), new HashSet<>(Arrays.asList(petyaRabotyaga, jenya3minutesToPensia))
        );
        System.out.println("############################################ Вывод главы завода 1 ############################################");
        System.out.println(joskiyGlavaZavoda + "\n");

        Director dirNaLaite = new Director("Дир", "На лайте", Position.DIRECTOR);
        dirNaLaite.addWorker(ivanTolkoChtoPriwel);
        joskiyGlavaZavoda.addWorker(dirNaLaite);

        joskiyGlavaZavoda.addWorker(dirNaLaite);

        System.out.println("############################################ Вывод главы завода 2 (после добавления нового дира) ############################################");
        System.out.println(joskiyGlavaZavoda + "\n");

        Worker katyaSuperSpec = new Worker("Катя", "Суперспец", Position.WORKER);
        Worker nihaoLiOutsource = new Worker("Нихао Ли", "На аутсорсе", Position.WORKER, LocalDate.parse("2010-10-09"));

        Director superKlassniyDir = new Director("Суперклассный", "Дир", Position.DIRECTOR);
        superKlassniyDir.addWorker(katyaSuperSpec);
        superKlassniyDir.addWorker(nihaoLiOutsource);
        joskiyGlavaZavoda.addWorker(superKlassniyDir);


        System.out.println("############################################ Вывод 3 дира ############################################");
        System.out.println(superKlassniyDir + "\n");

        System.out.println("############################################ Вывод главы завода 3 (после добавления 3 дира) ############################################");
        System.out.println(joskiyGlavaZavoda + "\n");

        System.out.println("!!! -- Запускаем определятор -- !!!");
        OpredelyatorService opredelyatorService = OpredelyatorService.getInstance();

        Director directorForDetermineService = joskiyGlavaZavoda;
        String employeeNameForDetermineService = "Катя";

        if (opredelyatorService.determinePresenceEmployeeWithNameInDirectorSubordinateStructure(directorForDetermineService,employeeNameForDetermineService)) {
            System.out.printf("У директора (%s) есть в подчинении сотрудник с именем (%s)",
                    directorForDetermineService.getLastName() + " " + directorForDetermineService.getFirstName(), employeeNameForDetermineService);
        } else {
            System.out.printf("У директора (%s) нету в подчинении сотрудника с именем (%s)",
                    directorForDetermineService.getLastName() + " " + directorForDetermineService.getFirstName(), employeeNameForDetermineService);
        }



    }
}
