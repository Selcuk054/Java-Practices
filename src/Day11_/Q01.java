package Day11_;

public class Q01 {

    /*
     * {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}} int 2D arrayini  olustur
     *  2D-dimension arrayinden min number print et
     */

    public static void main(String[] args) {

        int arr[][]={{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}};

        int min = arr[0][0];
        for (int i = 0; i <arr.length ; i++) { //outer for
            System.out.println("Arr ["+ i+"].length i : "+arr[i].length);
            for (int j = 0; j <arr[i].length ; j++) { //inner for
                if(arr[i][j]<min){
                    min = arr[i][j];
                }

            }

        }
        System.out.println("min = " + min);
    }
}
