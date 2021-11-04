//класс для работы с массивом строк


public class ArrayString {
    private String[] arr;  //создание ссылки массива
    private int n; //количество элементов в массиве

    ArrayString(int n) { // конструктор - шаблон создания массива
        this.n = n;
        arr = new String[n];
    }

    public String[] builder() {  //метод, который заполняет массив значеньями букв и null
        String str;
        char ch = 'A';
        for (int i = 0; i<n; i++) {
            if((i == 3)||(i == 6)) {
                arr[i] = null;
            }else {
                str = ((new StringBuilder()).append(ch)).toString();
                arr[i] = str;
                ch++;
            }
        }return arr;
    }

}
