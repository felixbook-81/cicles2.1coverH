
public class Main {
    public static void main(String[] args) {
        task21();
        task22();
        task23();
        task24();
        task25();
        task26();
        task27();
        task28();

    }

    public static void task21() {


        /** Продолжите работать с кодом, который вы написали в предыдущем уроке — в задачах с накоплениями.

         С помощью цикла while посчитайте, сколько месяцев потребуется, чтобы накопить 2 459 000 рублей при условии, что первоначально мы имеем 0 рублей и готовы откладывать по 15 тысяч рублей.

         Результат программы должен быть выведен в консоль с тем количеством месяцев, которое необходимо для накопления данной суммы. Формат сообщения: «Месяц …, сумма накоплений равна … рублей» .
         */
        int month = 1;
        int summa = 0;
        while (summa < 2_459_000) {

            summa += 15000;
            System.out.printf("Месяц %d сумма накоплений равно %d рублей \n", month, summa);
            month++;
        }
    }

    public static void task22() {


        System.out.println("task 2.2");

        /**Выведите в одну строку через пробел числа от 1 до 10 с помощью цикла while.

         На следующей строке выведите числа в обратном порядке от 10 до 1 с помощью цикла for.

         Для обоих циклов можно использовать как одну общую переменную, так и в каждом цикле свою.

         Не забудьте выполнить переход на новую строку между двумя циклами.

         В результате программы вывод должен получиться следующий:

         1 2 3 4 5 6 7 8 9 10

         10 9 8 7 6 5 4 3 2 1
         */

        int var = 1;
        while (var <= 10) {
            System.out.print(var + " ");
            var++;
        }

        for (var = 10; var > 0; var--) {
            if (var == 1) {
                System.out.println(var);
                break;
            }
            System.out.print(var + " ");

        }

    }

    public static void task23() {
        System.out.println("task 2.3");
        /**В стране Y население равно 12 миллионов человек.

         Рождаемость составляет 17 человек на 1000, смертность — 8 человек. Рассчитайте, какая численность населения будет через 10 лет, если показатели рождаемости и смертности постоянны.

         В консоль выведите результат операции на каждый год в формате: «Год …, численность населения составляет …».
         */
        int population = 12_000_000;
        int birthRate = 17 * population / 1000;
        int deathRate = 8 * population / 1000;
        for (int i = 1; i < 10; i++) {
            population += birthRate;
            ;
            System.out.printf("Год %d,численность %d \n",i,population);
        }

    }



public static void task24(){
        System.out.println("task 2.4");
        /** Василий решил положить деньги на накопительный счет, где каждый месяц к сумме его вклада добавляется еще 7%. Первоначальная сумма вклада — 15 тысяч рублей.
         Вычислите и выведите в консоль, сколько месяцев Василию нужно будет копить, чтобы собрать сумму в 12 миллионов рублей при условии, что процент банка от накоплений не меняется, а всегда равен 7%.
         Выведите в консоль результат программы с указанием суммы накоплений по каждому месяцу.
         */
        int summa=15000;
        int month=1;
        while(summa<=12_000_000){
        summa*=1.07;
        System.out.printf("Месяц %d , сумма %d  \n",month,summa);
        month++;
        }


        }


public static void task25(){
        System.out.println("task 2.5");
        /**Видоизмените программу таким образом, чтобы в консоль выводились не все месяцы подряд, а только каждый шестой. Должны быть видны накопления за 6, 12, 18, 24-й и следующие месяцы.
         *
         */

        //я не смог
        }

public static void task26(){
        System.out.println("task 2.6");
/**Василий решил, что будет копить деньги ближайшие 9 лет. Он хочет знать, какой будет сумма его накоплений каждые полгода на протяжении этих 9 лет.
 Исходная сумма всё та же — 15 тысяч рублей, проценты банка – 7% ежемесячно.
 Напишите программу, которая будет выводить сумму накоплений за каждые полгода в течение 9 лет.
 */
        int summa=15000;

        for(int i=1;i< 9*12;i+=6){
        int total=summa;
        summa*=1+0.07*6;
        System.out.printf("Месяц %d , сумма %d  \n",i,summa-total);
        }


    }

    public static void task27() {
        System.out.println("task 2.7");


        /**В компании пятница — отчетный день.

         Нужно написать программу, которая считает дни месяца по датам, определяет, какой день пятница, и выводит сообщение с напоминанием, что нужно подготовить еженедельный отчет.

         Создайте переменную типа int, которая хранит в себе номер первой пятницы месяца (число от 1 до 7).

         Выведите на каждую пятницу месяца (включая полученную) сообщение следующего вида: «Сегодня пятница, ...-е число. Необходимо подготовить отчет».

         В нашем месяце 31 день. В результате у вас должно получиться от 4 до 5 сообщений с напоминаниями по разным датам.
         */
        int firstFryday = 6;
        for (int currentFriday = firstFryday; currentFriday <= 31; currentFriday += 7) {
            System.out.println("Сегодня пятница " + currentFriday + "-е число" + "Необходимо подготовить отчет");
        }
    }

    public static void task28() {
        System.out.println("task 2.8");
/**Нам нужно написать астрономическое приложение, которое считает, когда над Землей пролетает комета.

 Известно, что комета пролетает каждый 79-й год, начиная с нулевого.

 В консоль нужно вывести все годы за последние 200 лет, когда появлялась комета, а также следующий год ее появления (ближайшие 100 лет).

 Для вычисления периода можно создать две дополнительные переменные, которые содержат год за 200 лет до текущего (из созданной ранее переменной) в качестве старта и 100 лет после в качестве завершения периода расчета.

 В результате решения задачи в консоли должен получиться следующий результат:

 1896

 1975

 2054
 */
      int currentYear=2022;
      int begining=currentYear-200;
      int ending = currentYear+100;
        for (int i = begining = 0; begining <ending ; ++i) {
            if(i % 79==0){
                System.out.println(i);
            }
        }

    }


}





















