public class cobafor {
    public static void main(String[] args) {

        for ( int i = 0 ; i < 10 ; i--){
            if ( i % 2 == 0){
                continue;
            }
            else if ( i % 3 == 0){
                break;
            }
            else{
                System.out.println(i + " ");
            }
        }
    }
}
