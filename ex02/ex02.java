
class ex02 {
    static void print(Object o) {System.out.print(o);}
    public static void main (String[] args){
        int i = 1;
        while (i <= 10)
            print(i++ + " ");
    
        for (int j = 1; j <= 10;j++)
        {
            print(j+",");
        }
    }
}