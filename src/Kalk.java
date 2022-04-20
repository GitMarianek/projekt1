public class Kalk {
        public static void main(String[] args) {
//                /*1*/ int x = 3;
//                /*2*/ int y;
//                /*3*/ System.out.println(x++);   // =3
//                /*4*/ System.out.println(++x);   // =5
//                /*5*/ System.out.println(x);     // =5
//                /*6*/ y = x++;                   // y=5
//                /*7*/ System.out.println(y);
//                /*8*/ y = ++x; // 7
//                /*9*/ System.out.println(y);
//                /*10*/ System.out.println(++y);  //8

//                int [] TablicaCyfr = new int[5];
//                TablicaCyfr = new int[]{1, 2, 3, 4, 5};
//                System.out.println(TablicaCyfr[2]);  // liczymy od zera dlatego wyskoczy 3

                String [] TablicaPieskow = new String [4];
                TablicaPieskow = new String[]{"Azor", "Boss", "King", "Kudłaty"};
                System.out.println(TablicaPieskow[2]);

                for (int i = 0; i < TablicaPieskow.length ; i++){
                        System.out.println(TablicaPieskow[i]);
                }
        }
}