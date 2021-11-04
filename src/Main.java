//Программа с сайта https://habr.com/ru/post/440436/
//задание 6.3
  //Создание фильтра для массива строк
// это главный класс
public class Main {
    public static void main(String[] args) {
       int  n = 10; //количество элементов в массиве
        ArrayString arrayClin = new ArrayString(n); //создание массива 10 элементов

        System.out.println("До фильтра");
        String[] arrBuild = arrayClin.builder(); //заполнение массива
        for(int i = 0; i<n; i++) {  //печать массива
            System.out.println(arrBuild[i]);
        }

        FilterNull filter = new FilterNull(); //создания объекта фильтра

        String[] arrFilter;
        arrFilter = filter.apply(arrBuild); // применения фильтра к массиву строк
        int l = arrFilter.length;

        System.out.println("После фильтра");
        for(int i = 0; i<l; i++) {  //печать массива после фильтра
            System.out.println(arrFilter[i] + " ");
        }
    }
}