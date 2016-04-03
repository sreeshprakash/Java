class Volume{
public static double main(int... arg) throws IOException{
    if(arg.length == 1){ //calculate cube volume
        return Math.pow(arg[0], 3);
    }else if(arg.length == 3){ //calculate cuboid volume          
        return (double)(arg[0]*arg[1]*arg[2]);
    }
    throw new IOException("Incorect number of arguments");
}

public static double main(double... arg) throws IOException{
    if(arg.length == 1){ //calculate hemisphere volume            
        return ((2.0/3.0)* Math.PI *Math.pow(arg[0], 3));
    }else if(arg.length == 2){ //calculate cyllinder volume            
        return (Math.PI *Math.pow(arg[0], 2)*arg[1] );
    }
    throw new IOException("Incorect number of arguments");
}

public static void display(double volume){
    double roundUp  = new BigDecimal(String.valueOf(volume)).setScale(3,RoundingMode.HALF_UP).doubleValue();
    DecimalFormat f = new DecimalFormat("##.000");
    System.out.println(f.format(roundUp));
}  
}
class Calculate{ static Volume output = new Volume(); static Scanner sc = new Scanner(System.in);
public static Volume get_Vol(){
    return output;
}

public static double getDoubleVal() throws NumberFormatException{
    double val = sc.nextDouble();
    if(val <= 0.0f) throw new NumberFormatException("All the values must be positive");
    return val;
}
public static int getINTVal() throws NumberFormatException{
    int val = sc.nextInt();
    if(val <= 0) throw new NumberFormatException("All the values must be positive");
    return val;
}   
}
