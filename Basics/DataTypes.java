
public class DataTypes {
    public static void main(String[] args){
        //byte (1byte), short (2byte), int (4byte), long (8byte), 
        final int intVal = 1;
        //float(4byte), double(8byte)
        final float floatVal = 1E2f;
        //char (2byte)
        final char charVal = 'O'; 
        final String stringVal = "One";
        //boolean (1bit)
        final boolean boolVal = true; 

        System.out.print(
        intVal +"\n"+
        stringVal+"\n"+
        floatVal+"\n"+
        charVal+"\n"+
        boolVal);
    }
}
