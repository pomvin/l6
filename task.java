/*
 * Подумать над структурой класса Ноутбук для магазина техники - выделить поля и
 * методы. Реализовать в java.
 * Создать множество ноутбуков.
 * Написать метод, который будет запрашивать у пользователя критерий (или
 * критерии) фильтрации
 * и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в
 * Map.
 * Например: “Введите цифру, соответствующую необходимому критерию:
 * 1 - ОЗУ
 * 
 * 2 - Объем ЖД
 * 
 * 3 - Операционная система
 * 
 * 4 - Цвет …
 * 
 * Далее нужно запросить минимальные значения для указанных критериев -
 * сохранить параметры фильтрации можно также в Map.
 * Отфильтровать ноутбуки их первоначального множества и вывести проходящие по
 * условиям.
 */

import java.util.HashSet;
import java.util.Set;

public class task {
    public static void main(String[] args) {

        Laptop MacBook = new Laptop("MacBook", 14, "4k",
                true, 500, "16", "ios", "blue");
        Brand brandHp = new Brand("MacBook", "U.S.A.", "AmericaLanguage");
        MacBook.addBrand(brandHp);
        Laptop ASUS = new Laptop("ASUS", 16, "FullHD",
                true, 500, "16", "Windows", "white");
        ASUS.addBrand(brandHp);
        Laptop Xiaomi_RedmiBook = new Laptop("Xiaomi_RedmiBook", 18, "FullHD",
                true, 300, "8", "Windows", "black");
        Brand brandSamsung = new Brand("Samsung", "Korea", "KoreaLanguage");
        Xiaomi_RedmiBook.addBrand(brandSamsung);
        Laptop lenovo_gtx76 = new Laptop("lenovo_gtx76", 16, "FullHD",
                true, 700, "4", "Windows", "white");
        Brand brandLenovo = new Brand("Lenovo", "China", "ChinaLanguage");
        lenovo_gtx76.addBrand(brandLenovo);
        Laptop MacBook_14pro = new Laptop("MacBook_14pro", 17, "4k",
                false, 1000, "8", "ios", "white");
        Brand brandMacbook = new Brand("Apple", "U.S.A.", "AmericaLanguage");
        MacBook_14pro.addBrand(brandMacbook);
        Laptop HONOR_MagicBook = new Laptop("HONOR_MagicBook", 24, "4k",
                true, 500, "8", "Windows", "pink");
        HONOR_MagicBook.addBrand(brandLenovo);

        Set<Laptop> laptop = new HashSet<>();
        laptop.add(MacBook);
        laptop.add(ASUS);
        laptop.add(Xiaomi_RedmiBook);
        laptop.add(lenovo_gtx76);
        laptop.add(MacBook_14pro);
        laptop.add(HONOR_MagicBook);

        Laptop FilterLaptop = new Laptop();

        System.out.println(FilterLaptop.newFilter(laptop));
    }
}