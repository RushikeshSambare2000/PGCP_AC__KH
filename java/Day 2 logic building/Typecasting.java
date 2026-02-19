class Typecasting {
    public static void main(String[] args) {
        byte a = 127;
        byte b=(byte)129;
        // System.out.println(b);   //-127
        


        short c = 32767;
        byte k= (byte)c;
        System.out.println(k);
        // short c =32768;           error :possible lossy conversion from int to byte
        int d=(int)32768;          //typecast c into int
        System.out.println(d);

        int x='b';
        System.out.println(x);  //98 implicite typecasting
        
        float s=767676876;      // 7.6767686E8 converted into float
        System.out.println(s);

        
        int num=130;
        // byte num2 = num;  //error: incompatible types: possible lossy conversion from int to byte
        byte num2 =(byte) num;
        System.out.println(num2);


        

    }
}