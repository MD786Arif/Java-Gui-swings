public class DsAndAlgo {
    public static void main(String[] args) {
        String []a = {"1","2","3","4","6"};
         for(int i = 0;i<a.length;i++){
             if(i+2<6){
                 for(int j = i;j<i+3;j++){
                     System.out.print(a[j]+" ");
                 }
             }

             System.out.println();
         }
    }
}
