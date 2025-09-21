public class dutchflagb {
    public int[] sortnum(int num [] ){
        int n = num.length;
        int z = 0 ;
        int o     =  0 ;
        int t = 0 ;

        for(int i = 0 ; i < n ; i++){
            if( num[i] == 0 ){
                z++;
            }
            else if (num[i] == 1){
                o++;

            }
            else {
                t++;

            }
            for( i = 0 ; i < z ; i++ ){
                num[i] = 0 ;

            }
             for(i = z ; i < z + o ; i++ ){
                num[i] = 1 ;

            }
             for(i = z + o ; i < n ; i++ ){
                num[i] = 2 ;

            }


        }
        return num ;
    }
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        System.out.println("Original Array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        dutchflagb sort = new dutchflagb();
        int[] sortedArray = sort.sortnum(arr);
        System.out.println("Sorted Array:");
        for (int i : sortedArray) {
            System.out.print(i + " ");
        }
    }
}
