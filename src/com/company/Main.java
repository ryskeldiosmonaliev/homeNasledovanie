package com.company;

public class Main {
    public static void main(String[] args) {
        Proramer proramer = new Proramer("Рыскелди", "Осмоналиев", "курс java", 10000, "Самсы", "Кудай буюрса Google", "java");
        System.out.println(proramer);
        System.out.println("в какой компонии работает-> " + proramer.getComponyName() + "  на каком языке пишед-> " + proramer.getCoding());
        System.out.println();

        Danser danser =new Danser("Вацлав","Нижинский","балные танцы",12000,"не известно","Лондонской Королевской академии танца","балные танцы");
        System.out.println(danser);
        System.out.println("вид танцов-> "+danser.getDansing()+" группа->"+danser.getGroupName());
        System.out.println();

        Singer singer = new Singer("Виктор","ЦоЙ","закончель",12000,"не известно","Группа крови","yes","yes");
        System.out.println(singer);
        System.out.println("Группа-> "+singer.getBandName()+"хорошо поет->"+singer.getSinging()+"умеит играт на гитаре? Ответ-> " +singer.getPlayGitar());
    }
}


