package day12_Practices;

import java.util.ArrayList;
import java.util.List;

public class Q01_forEachLoopTekCift {
    public static void main(String[] args) {
        // int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,14,15,16,17,18};
        // verilen array de once cift olan sayilari, sonra da tek olan sayilari for each loop kullanarak yazdiriniz..

        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,14,15,16,17,18};
        List<Integer> tek=new ArrayList<>();
        List<Integer> cift=new ArrayList<>();

        int ciftler=0;
        int tekler=0;

        for (int eachTek:arr
             ) {
            if (eachTek%2==1){
                tek.add(eachTek);
            }
        }System.out.println("Array deki tek sayilar ;"+tek);
        for (int eachcift:arr
             ) {
            if (eachcift%2==0) {
                cift.add(eachcift);
            }
        }
        System.out.print("Arraydeki cift sayilar :"+cift);
    }
}
