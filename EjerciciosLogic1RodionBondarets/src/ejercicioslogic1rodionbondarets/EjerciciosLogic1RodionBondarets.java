/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioslogic1rodionbondarets;
/**
 *
 * @author xp
 */
public class EjerciciosLogic1RodionBondarets {
    
    public boolean cigarparty(int cigars, boolean isWeekend){
        if(isWeekend && cigars >= 40){
          return true;
      }
      if(cigars >= 40 && cigars <= 60){
          return true;
      }
          return false;
    }
    public int dateFashion(int you, int date){
        if(you <= 2 || date <= 2){
            return 0;
        }
        if(you >= 8 || date >= 8){
            return 2;
        }
        return 1;
    }
     public boolean squirrelPlay(int temp, boolean isSummer) {
         if(isSummer == false && temp >= 60 && temp <= 90 ){
             return true;
         }
         if(isSummer == true && temp >= 60 && temp <= 100){
             return true;
         }
         return false;
}
     public int caughtSpeeding(int speed, boolean isBirthday) {
         if(isBirthday == false && speed <= 60){
             return 0;
         }
         if(isBirthday == false && speed >= 61 && speed <= 80){
             return 1;
         }
         if(isBirthday == false && speed > 81){
             return 2;
         }
         if(isBirthday == true && speed <= 65){
             return 0;
         }
         if(isBirthday == true && speed >= 66 && speed <= 85){
             return 1;
         }
         if(isBirthday == true && speed > 85){
             return 2;
         }
         return -1;
}
    public int sortaSum(int a, int b){
        int result = a+b;
        if(result >=10 && result <=19 ){
             return 20;
         }
         return result;
  }
   public String alarmClock(int day, boolean vacation) {
  if(vacation == true && day >= 1 && day <= 5){
    return "10:00";
  }
   if(vacation == false && day == 0 || vacation == false && day == 6){
    return"10:00";
    }
  if(vacation == true && day == 0 || true && day == 6){
    return"off";
    }
    return "7:00";
}
public boolean love6(int a, int b) {
  if(a == 6 || b == 6 || a+b == 6 || Math.abs(a-b) == 6){
    return true;
  }
  return false;
}
public boolean in1To10(int n, boolean outsideMode) {
  //Si el outsidemode esta en true y n sea menor que uno y mallor que 10 devuelve true.
  if(outsideMode == true && (n <= 1 || n >= 10)){
    return true;
  }
  //Si ousidemode esta en false y n valga de 1 a 10 devuelve true.
  if(outsideMode == false && n >= 1 && n <= 10){
    return true;
  }
  //En cualquier otro caso devuelve false.
  return false;
}
public boolean specialEleven(int n) {
  //Si el resto de n entre 11 da 0 o 1 devuelve true.
  if(n % 11 == 0 || n % 11 == 1){
    return true;
  }
  //En cualquier otro caso devuelve false.
  return false;
}
  public boolean more20(int n) {
  //Si el resto de n entre 20 es 1 0 2 devuelve true.
  if(n % 20 == 1 || n % 20 == 2){
    return true;
  }
  //En cualquier otro caso devuelve false.
  return false;
}    
public boolean old35(int n) {
  //Si el resto de n entre 5 y el de n entre 3 es el mismo devuelve false.
  if(n % 3 == n % 5){
    return false;
  }
  //Si el resto de n entre 3 o n entre 5 es 0 pero no los 2 a la vez devuelve true.
  if(n % 3 == 0 || n % 5 == 0){
    return true; 
  }
  //En cualquier otro caso devuelve false.
  return false;
}  
public boolean less20(int n) {
  //Si n + 1 o + 2 entre 20 da de resto 0 devuelvuelve true.
  if((n +1) % 20 == 0 || (n +2) % 20 == 0 ){
    return true;
  }
  //En cualquier otro caso devuelve false.
  return false;
}
public boolean nearTen(int num) {
  //Si num +2, +1, -2 o el solo dividido entre 10 da de resto 0 devuelve true.
  if((num + 2) % 10 == 0 || (num + 1) % 10 == 0 || (num - 2) % 10 == 0 || (num - 1) % 10 == 0 || num % 10 == 0 ){
    return true;
  }
  //En cualquier otro caso devuelve false.
  return false;
}
public int teenSum(int a, int b) {
  //Si a o b valen entre 13 y 19 devuelve 19. 
  if(a >= 13 && a <= 19 || b >= 13 && b <=19){
    return 19;
  }
  //En cualquier otro caso devuelve el resultado de la suma de a y b.
  return a+b;
}
public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        //Si esta durmiendo no coge el telefono.
        if(isAsleep == true){
           return false;
        }
        //Si es por la mañana y no es su madre no coge el telefono. 
        if(isMorning == true && isMom == false){
            return false;  
        }
        //En cualquier otro caso si lo coge
        return true;
}
public int teaParty(int tea, int candy) {
  //Si menos de 5 dulces o tes sera una fiesta mala.
  if(tea < 5 || candy < 5){
    return 0;
  }
  //Si hay mas del doble de tes o dulces la fiesta sera muy buena.
   if(tea >= candy * 2 || candy >= tea * 2){
    return 2;
  }
  //En cualquier otro caso la fiesta sera buena a secas.
  return 1;
}
public String fizzString(String str) {
  //Si el string empieza por f y termina en b decuelve FizzBuzz.
  if(str.startsWith("f") && str.endsWith("b")){
    return "FizzBuzz";
  }
  //Si el string empieza por f devuelve Fizz.
  if(str.startsWith("f")){
    return "Fizz";
  }
  //Si termina por b devuelve buzz.
  if(str.endsWith("b")){
    return "Buzz";
  }
  //En cualquier otro caso devuelve el string.
  return str;
}
public String fizzString2(int n) {
  //Si el resto de n entre 5 y entre 3 es 0(son pares) devuelve FizzBuzz.
  if(n%3==0 && n%5==0 ){
    return "FizzBuzz!";
  }
  //Si solo el resto de 3 es 0 (es par) devuelve Fizz.
  if(n % 3 == 0){
    return "Fizz!";
  }
  //Si solo es multiplo de 5 devuelve Buzz.
  if(n % 5 == 0){
    return "Buzz!";
  }
  //En cualquier otro caso se devuelve el valor de n con una exclamacion.
  return n+ "!";
}
public boolean twoAsOne(int a, int b, int c) {
  //Si la suma de 2 ints da como resultado igual que el tercer int devuelve true.
  if(a+b==c || c+b==a || c+a==b){
    return true;
  }
  //En cualquier otro caso devuelve false.
  return false;
}
public boolean inOrder(int a, int b, int c, boolean bOk) {
  //Si bOk esta en false y b es mayor que a y c es mayor que b devuelve true.
  if(bOk == false && b > a && c > b){
    return true;
  }
  //Si bOk esta en true b no tiene que ser mayor que a para devolver true.
  if(bOk == true && c > b){
    return true;
  }
  //En cualquier otro caso devuelve false.
  return false;
}
public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
  //Si equalOk esta en true los numeros pueden ser mayores o iguales de forma ascendente.
  if(equalOk == true && (a <= b && b <= c)){
    return true;
  }
  //Si equalOK esta en false deben ser mayores de forma ascendente para devolver true.
  if(equalOk == false && a < b && b < c){
    return true;
  }
  //En cualquier otro caso se devuelve false.
  return false;
}
public boolean lastDigit(int a, int b, int c) {
  //Creamos un int para cada uno de los restos de los ints a,b y c.
  int ra = a % 10;
  int rb = b % 10;
  int rc = c % 10;
  //Si alguno de los restos son iguales devuelve true.
  if(ra == rb || rb == rc || ra == rc){
    return true;
  }
  //En cualquier otro caso devuelve false.
  return false;
}
public boolean lessBy10(int a, int b, int c) {
  //Si algun int es igual a 10 o alguna resta de 2 posibles ints da igual o mayor que 10 devuelve true.
  if(a - b >= 10 || b - c >= 10 || c - a >=10 || b - a >= 10 || c - b >= 10 || a - c >= 10 || b - a >= 10){
    return true;
  }
  //En cualquier otro caso devuelve false.
  return false;
}
public int withoutDoubles(int die1, int die2, boolean noDoubles) {
  //Si noDoubles vale true y die1 es igual a 6 devuelve el valor de die1 + 1.
  if(noDoubles == true && die1 == 6){
      return die1 + 1;
    }   
    //Si noDoubles vale true y los 2 dados son iguales  devuelve la suma de los dados mas 1.
   if(noDoubles == true && die1 == die2){
            return die1+die2+1;
        }
        //En cualquier otro caso devuelve la suma de los 2 dados.
       return die1+die2;
}
public int maxMod5(int a, int b) {
  //Si los 2 valores son iguales devuelve 0.
  if(a == b){
    return 0;
  }
  //Si los restos de los 2 ints entre 5 da 0 se ejecuta el siguiente if.
  if((a % 5) == (b % 5)){
    //Este if devuelve  
    if(a > b ){
      return b;
    }
      return a;
    } 
    //Y este tambien devuelve el mas pequeño.
  if(a > b){
    return a;
  }
  if(b > a){
    return b;
  }
  return a;
}
public int redTicket(int a, int b, int c) {
  //Si todos los ints valen 2 devuelve 10.
  if(a == b && b == c && a == 2){
    return 10;
  }
  //Si todos son iguales y no valen 2 dvuelve 5.
  if(a == b && b == c){
    return 5;
  }
  //Si ninguno es igual  devuelve 1.
  if(a != b && c != a){
    return 1;
  }
  //En cualquier otro caso devuelve 0.
  return 0;
}
public int greenTicket(int a, int b, int c) {
  //Si todos los ints son iguales devuelve 20.
  if(a == b && b == c){
    return 20;
  }
  //Si 2 ints son iguales devuelve 10.
  if(a == b || b == c || c == a){
    return 10;
  }
  //Si ninguno son iguales devuelve 0.
  if(a != b && b != a){
    return 0;
  }
  //En cualquier otro caso devuelve 1.
  return 1;
}
public int blueTicket(int a, int b, int c) {
  //Creamos un int para cada suma entre a, b y c.
  int ab = a + b;
  int bc = b + c;
  int ac = c + a;
  //Si alguna de las sumas da 10.
  if(ab == 10 || bc == 10 || ac == 10){
    return 10;
  }
  //Si alguna suma es mayor que diez devuelve 5.
  if(ab - 10 == bc || ab - 10  == ac){
    return 5;
  }
  //En cualquier otro caso devuelve 0.
  return 0;
}
public boolean shareDigit(int a, int b) {
  //Creamos variables con la division y los restos de a y b.
  int primeroa = a / 10;
  int segundoa = a % 10;
  int primerob = b / 10;
  int segundob = b % 10;
  //Si alguno coincide devuelve true.
  if(primeroa == primerob || primeroa == segundob || primerob == segundoa || segundoa == segundob){
    return true;
  }
  //En cualquier otro caso devuelve false.
  return false;
}
public int sumLimit(int a, int b) {
  //Creamos un String con la longitud de a y de la suma de a y b.
  String digitosa = String.valueOf(a);
  String digitosab = String.valueOf(a + b);
  //Si la longitud de a y la suma de a+b son iguales devuelve a+b
  if(digitosab.length() ==  digitosa.length()){
    return a + b;
  }
  //En el caso contrario solo devurelve a.
  return a;
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //Creamos un objeto de la clase en la que estamos(Ejerciciosbasicosjava).
        EjerciciosLogic1RodionBondarets ejercicio = new EjerciciosLogic1RodionBondarets();
        //cigarparty
        System.out.println("Ejercicio 1 cigarparty:");
        System.out.println(ejercicio.cigarparty(30, false));
        System.out.println(ejercicio.cigarparty(50, false));
        System.out.println(ejercicio.cigarparty(70, true));
        //dateFAshion
        System.out.println("Ejercicio 2 dateFashion:");
        System.out.println(ejercicio.dateFashion(5,10));
        System.out.println(ejercicio.dateFashion(5,2));
        System.out.println(ejercicio.dateFashion(5,5));
        //squirrelPlay
        System.out.println("Ejercicio 3 squirrelPlay");
        System.out.println(ejercicio.squirrelPlay(70,false));
        System.out.println(ejercicio.squirrelPlay(95,false));
        System.out.println(ejercicio.squirrelPlay(95,true));
        //caughtSpeeding
        System.out.println("Ejercicio 4 caughtSpeeding");
        System.out.println(ejercicio.caughtSpeeding(60,false));
        System.out.println(ejercicio.caughtSpeeding(65,false));
        System.out.println(ejercicio.caughtSpeeding(65,true));
        //sortaSum
        System.out.println("Ejercicio 5 sortaSum");
        System.out.println(ejercicio.sortaSum(3,4));
        System.out.println(ejercicio.sortaSum(9,4));
        System.out.println(ejercicio.sortaSum(10,11));
        //alarmClock
        System.out.println("Ejercicio 6 alarmClock");
        System.out.println(ejercicio.alarmClock(1,false));
        System.out.println(ejercicio.alarmClock(5,false));
        System.out.println(ejercicio.alarmClock(0,false));
        //love6
        System.out.println("Ejercicio 7 love6");
        System.out.println(ejercicio.love6(6, 4));
        System.out.println(ejercicio.love6(4, 5));
        System.out.println(ejercicio.love6(1, 5));
        //in1To10
        System.out.println("in1To10");
        System.out.println(ejercicio.in1To10(5, false));
        System.out.println(ejercicio.in1To10(11, false));
        System.out.println(ejercicio.in1To10(11, true));
        //specialEleven
        System.out.println("specialEleven");
        System.out.println(ejercicio.specialEleven(22));
        System.out.println(ejercicio.specialEleven(23));
        System.out.println(ejercicio.specialEleven(24));
        //more20
        System.out.println("more20");
        System.out.println(ejercicio.more20(20));
        System.out.println(ejercicio.more20(21));
        System.out.println(ejercicio.more20(22));
        //old35
        System.out.println("old35");
        System.out.println(ejercicio.old35(3));
        System.out.println(ejercicio.old35(10));
        System.out.println(ejercicio.old35(15));
        //less20
        System.out.println("less20");
        System.out.println(ejercicio.less20(18));
        System.out.println(ejercicio.less20(19));
        System.out.println(ejercicio.less20(20));
        //nearTen
        System.out.println("nearTen");
        System.out.println(ejercicio.nearTen(12));
        System.out.println(ejercicio.nearTen(17));
        System.out.println(ejercicio.nearTen(19));
        //teenSum
        System.out.println("teenSum");
        System.out.println(ejercicio.teenSum(3,4));
        System.out.println(ejercicio.teenSum(10,13));
        System.out.println(ejercicio.teenSum(13,2));
        //answerCell
        System.out.println("answerCell");
        System.out.println(ejercicio.answerCell(false,false,false));
        System.out.println(ejercicio.answerCell(false,false,true));
        System.out.println(ejercicio.answerCell(true,false,false));
        //teaParty
        System.out.println("teaParty");
        System.out.println(ejercicio.teaParty(6,8));
        System.out.println(ejercicio.teaParty(3,8));
        System.out.println(ejercicio.teaParty(20,6));
        //fizzString
        System.out.println("fizzString");
        System.out.println(ejercicio.fizzString("fig"));
        System.out.println(ejercicio.fizzString("dib"));
        System.out.println(ejercicio.fizzString("fib"));
        //fizzString2
        System.out.println("ffizzString2");
        System.out.println(ejercicio.fizzString2(1));
        System.out.println(ejercicio.fizzString2(2));
        System.out.println(ejercicio.fizzString2(3));
        //twoAsOne
        System.out.println("twoAsOne");
        System.out.println(ejercicio.twoAsOne(1,2,3));
        System.out.println(ejercicio.twoAsOne(3,1,2));
        System.out.println(ejercicio.twoAsOne(3,2,2));
        //inOrder
        System.out.println("inOrder");
        System.out.println(ejercicio.inOrder(1,2,4,false));
        System.out.println(ejercicio.inOrder(3,2,1,false));
        System.out.println(ejercicio.inOrder(1,1,2,true));
        //inOrderEqual
        System.out.println("inOrderEqual");
        System.out.println(ejercicio.inOrderEqual(2,5,11,false));
        System.out.println(ejercicio.inOrderEqual(5,7,6,false));
        System.out.println(ejercicio.inOrderEqual(5,5,7,true));
        //lastDigit
        System.out.println("lastDigit");
        System.out.println(ejercicio.lastDigit(23,19,13));
        System.out.println(ejercicio.lastDigit(23,19,12));
        System.out.println(ejercicio.lastDigit(23,19,3));
        //lessBy10
        System.out.println("lessBy10");
        System.out.println(ejercicio.lessBy10(1,7,11));
        System.out.println(ejercicio.lessBy10(1,7,10));
        System.out.println(ejercicio.lessBy10(11,1,7));
        //withoutDoubles
        System.out.println("withoutDoubles");
        System.out.println(ejercicio.withoutDoubles(2,3,true));
        System.out.println(ejercicio.withoutDoubles(3,3,true));
        System.out.println(ejercicio.withoutDoubles(3,3,false));
        //maxMod5
        System.out.println("maxMod5");
        System.out.println(ejercicio.maxMod5(2,3));
        System.out.println(ejercicio.maxMod5(6,2));
        System.out.println(ejercicio.maxMod5(3,2));
        //redTicket
        System.out.println("redTicket");
        System.out.println(ejercicio.redTicket(2,2,2));
        System.out.println(ejercicio.redTicket(2,2,1));
        System.out.println(ejercicio.redTicket(0,0,0));
        //greenTicket
        System.out.println("greenTicket");
        System.out.println(ejercicio.greenTicket(1,2,3));
        System.out.println(ejercicio.greenTicket(2,2,2));
        System.out.println(ejercicio.greenTicket(1,1,2));
        //blueTicket
        System.out.println("blueTicket");
        System.out.println(ejercicio.blueTicket(9,1,0));
        System.out.println(ejercicio.blueTicket(9,2,0));
        System.out.println(ejercicio.blueTicket(6,1,4));
        //shareDigit
         System.out.println("sumLimit");
        System.out.println(ejercicio.sumLimit(2,3));
        System.out.println(ejercicio.sumLimit(8,3));
        System.out.println(ejercicio.sumLimit(8,1));
        //
    }
    
}