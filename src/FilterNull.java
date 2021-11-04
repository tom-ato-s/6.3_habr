import java.util.ArrayList;
 // класс по созданию фильтра для массива строк
//он убирает все значения null в массиве и возвращает массив измененный
public class FilterNull implements Filter{

    @Override
    public String[] apply(String[] arr) {
        ArrayList<String> arrayList= new ArrayList<String>();
        String[] arrNew;
        int  lArr = arr.length; // количество елементов во вхлдящем массиве
        int j = 0; // текущий индекс второго массива
        for(int i = 0; i< lArr; i++) {
            if (arr[i] == null) {
            }else arrayList.add(arr[i]);
            j++;
        }

        int lList = arrayList.size();
        arrNew = new String[lList] ;
        for(int i = 0; i<lList; i++) {
            arrNew[i] = arrayList.get(i);
        }
        return arrNew;
    }
}
