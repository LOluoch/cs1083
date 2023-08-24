public class printWave {
    public static final int WAVE_HEIGHT = 6;
    public static final int WAVE_WIDTH = 8;
    
    public static void main(String[] args) {
       wave();
}

public static void wave(){
    for (int i=1; i<=WAVE_HEIGHT; i++){
        if((i%2)== 1){ //Odd numbered rows
             printForwardSlash();
        }
        else{
            printBackSlash();
        }
        }
    }

public static void printForwardSlash(){ 
    for(int i=1;i<=WAVE_WIDTH;i++)
         System.out.print("/");
    System.out.println( );
}

public static void printBackSlash(){
    for(int i=1;i<=WAVE_WIDTH;i++)
        System.out.print("\\");
    System.out.println( );
}

}
