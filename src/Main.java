public  class Main {
    static void main(){

        System.out.println ("\n\tЗадание#1\n");

    int age=18;
    if (age >= 18) {
        System.out.println(" Он совершеннолетний" );
    }
    else  {
        System.out.println( "Он не достиг совершеннолетия, нужно немного подождать");
    }

    System.out.println ("\n\tЗадание#2\n");

    int temp =5;
    if (temp <=5){
        System.out.println("На улице, " +temp+   " градуса, "+ "холодно, нужно надеть шапку");
    }
    else  {
        System.out.println("На улице, " +temp+ " градуса, "+ " тепло,можно идти без шапки");
    }

        System.out.println ("\n\tЗадание#3\n");

    int speed=60;
    if (speed >=60){
        System.out.println("Если скорость "+speed+", то"+" придется заплатить штраф");}
    else {
        System.out.println("Если скорость "+speed+", то "+" можно ехать спокойно");
    }

        System.out.println ("\n\tЗадание#4\n");

    int year =9;
    if (year >= 2 && year <= 6){
            System.out.println("Если возраст человека равен "+year+" то ему нужно ходить в детский сад");
        }
    if (year >= 7 && year <= 17){
            System.out.println("Если возраст человека равен "+year+" то ему нужно ходить в школу");
        }
    if (year >= 18 && year <= 24){
            System.out.println("Если возраст человека равен "+year+" то его место в университете");
        }
    if ( year > 24){
            System.out.println("Если возраст человека равен "+year+" то ему пора ходить на работу");
        }

        System.out.println ("\n\tЗадание#5\n");

    int years=15; // количество лет
    boolean adult= false; // есть ли взрослый true-есть, false-нету
    if (years<=5){
        System.out.println("Если возраст ребенка равен "+ years + " то он не может кататься на аттракционе");
    }
    else if (years >= 5 && years <= 14 ) {
    if (adult){
        System.out.println("Если возраст ребенка равен " + years + " то можно кататься, есть сопровождене взрослого");
    }else {
        System.out.println("Если возраст ребенка равен "+ years + " то кататься нельзя, нет сопровождения взрослого");
    }}
    if (years > 14) {
        System.out.println("Если возраст ребенка равен "+ years + " то он может кататься без сопровождения взрослого");
    }

        System.out.println ("\n\tЗадание#6\n");

    int passengers =103; // Количество пассажиров.
    final int place=102; // Общие кол-во мест в вагоне.
    final int sedentary=60; // Сидячих мест.
    if (passengers < sedentary){
    int freeSeats=sedentary-passengers;
        System.out.println("В вагоне есть сидячие места. Cводобных сидячих мест "+ freeSeats);
    } else if (passengers < place) {
    int standing = place - passengers;
        System.out.println("Сидячих мест нет, но есть стоячие. \nСвободно стоячих мест: " + standing);
    }
    else {
        System.out.println("Вагон полон.\n Мест нет" );
    }

        System.out.println ("\n\tЗадание#7\n");

    int one=5; //15
    int two=8; //10
    int tree=3; //2
    if (one >= two && one > tree){
        System.out.println("Наибольшее число: " + one);}
    else if (two >= one && two> tree) {
        System.out.println("Наибольшее число: " + two);}
    else {
        System.out.println("Наибольшее число: " + tree);
    }

    }}