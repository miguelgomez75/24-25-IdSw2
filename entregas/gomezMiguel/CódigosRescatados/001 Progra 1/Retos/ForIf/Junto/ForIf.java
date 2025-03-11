public class ForIf {
    public static void main(String[] args) {
        
        Patron1();
        Espacioentrepatrones();
        Patron2();
        Espacioentrepatrones();
        Patron3();    
        Espacioentrepatrones();
        Patron4();
        Espacioentrepatrones();
        Patron5();
        Espacioentrepatrones();
        Patron6();        
        Espacioentrepatrones();
        Patron7();
        Espacioentrepatrones();
        Patron8();
        Espacioentrepatrones();
        Patron9();
        Espacioentrepatrones();
        Patron10();
        Espacioentrepatrones();
        Patron11();        
        Espacioentrepatrones();
        Patron12();
        Espacioentrepatrones();
        Patron13();
        Espacioentrepatrones();
        Patron14();
        Espacioentrepatrones();
        Patron15();
        Espacioentrepatrones();
        Patron16();
        Espacioentrepatrones();
        Patron17();
        Espacioentrepatrones();
        Patron18();
        Espacioentrepatrones();
        Patron19();
        Espacioentrepatrones();
        Patron20();
        Espacioentrepatrones();
        Patron21();
        System.out.println("");
        }
    static void Patron1(){
        
        int dimension;
        dimension = 21;

        for (int j = 1; j <= dimension; j = j + 1) {
            System.out.println();
            for (int i = 1; i <= dimension; i = i + 1) {

                if (
                // El código desde aqui
                    i==2 && j==2
                // El código hasta aquí
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
        }
    }        

    static void Patron2(){
        int dimension;
        dimension = 21;
        for (int j = 1; j <= dimension; j = j + 1) {
            System.out.println();
            for (int i = 1; i <= dimension; i = i + 1) {

                if (
                // El código desde aqui
                    i==2
                // El código hasta aquí
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
            
        }

    }

    static void Patron3(){
        int dimension;
        dimension = 21;
        for (int j = 1; j <= dimension; j = j + 1) {
            System.out.println();
            for (int i = 1; i <= dimension; i = i + 1) {

                if (
                // El código desde aqui
                    j==20
                // El código hasta aquí
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
            
            }
    }

    static void Patron4(){
        int dimension;
        dimension = 21;
        for (int j = 1; j <= dimension; j = j + 1) {
            System.out.println();
            for (int i = 1; i <= dimension; i = i + 1) {

                if (
                // El código desde aqui
                    i>= 8 && i<= 14
                // El código hasta aquí
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
        }
    }

    static void Patron5(){
        int dimension;
        dimension = 21;
        for (int j = 1; j <= dimension; j = j + 1) {
            System.out.println();
        
            for (int i = 1; i <= dimension; i = i + 1) {

                if (
                // El código desde aqui
                    i== 11 && j== 11 
                // El código hasta aquí
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
        }
    }

    static void Patron6(){
        int dimension;
        dimension = 21;
        for (int j = 1; j <= dimension; j = j + 1) {
            System.out.println();
            for (int i = 1; i <= dimension; i = i + 1) {

                if (
                // El código desde aqui
                    i== 11 || j== 11 
                // El código hasta aquí
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
        }
    }

    static void Patron7(){
        int dimension;
        dimension = 21;
        for (int j = 1; j <= dimension; j = j + 1) {
            System.out.println();
            for (int i = 1; i <= dimension; i = i + 1) {

                if (
                // El código desde aqui
                    i==j
                // El código hasta aquí
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
        }
    }

    static void Patron8(){
        int dimension;
        dimension = 21;
        for (int j = 1; j <= dimension; j = j + 1) {
            System.out.println();
            for (int i = 1; i <= dimension; i = i + 1) {

                if (
                // El código desde aqui
                    i+j == 22
                // El código hasta aquí
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
        }
    }

    static void Patron9(){
        int dimension;
        dimension = 21;
        for (int j = 1; j <= dimension; j = j + 1) {
            System.out.println();
            for (int i = 1; i <= dimension; i = i + 1) {

                if (
                // El código desde aqui
                    i==j || i+j ==22
                // El código hasta aquí
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
        }    
    }

    static void Patron10(){
        int dimension;
        dimension = 21;
        for (int j = 1; j <= dimension; j = j + 1) {
            System.out.println();
            for (int i = 1; i <= dimension; i = i + 1) {

                if (
                // El código desde aqui
                    i>=1 && i<=21 && j>= 1 && j <=21
                // El código hasta aquí
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }
    }

    static void Patron11(){
        int dimension;
        dimension = 21;
        for (int j = 1; j <= dimension; j = j + 1) {
            System.out.println();
            for (int i = 1; i <= dimension; i = i + 1) {

                if (
                // El código desde aqui
                    i != 11 || j != 11
                // El código hasta aquí
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
        }
    }

    static void Patron12(){
        int dimension;
        dimension = 21;
        for (int j = 1; j <= dimension; j = j + 1) {
            System.out.println();
            for (int i = 1; i <= dimension; i = i + 1) {

                if (
                // El código desde aqui
                    i != 11 && j !=11
                // El código hasta aquí
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
        }
    }

    static void Patron13(){
        int dimension;
        dimension = 21;
        for (int j = 1; j <= dimension; j = j + 1) {
            System.out.println();
            for (int i = 1; i <= dimension; i = i + 1) {

                if (
                // El código desde aqui
                    i+1 == j || j+1 == i
                // El código hasta aquí
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
        }
    }

    static void Patron14(){
        int dimension;
        dimension = 21;
        for (int j = 1; j <= dimension; j = j + 1) {
            System.out.println();
            for (int i = 1; i <= dimension; i = i + 1) {

                if (
                // El código desde aqui
                    i== 2 || i == 20 || j == 2 || j == 20
                // El código hasta aquí
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
        }
    }

    static void Patron15(){
        int dimension;
        dimension = 21;
        for (int j = 1; j <= dimension; j = j + 1) {
            System.out.println();
            for (int i = 1; i <= dimension; i = i + 1) {

                if (
                // El código desde aqui
                    i>=2 && i<=5 || j>=2 && j<=5
                // El código hasta aquí
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
        }
    }

    static void Patron16(){
        int dimension;
        dimension = 21;
        for (int j = 1; j <= dimension; j = j + 1) {
            System.out.println();
            for (int i = 1; i <= dimension; i = i + 1) {

                if (
                // El código desde aqui
                    i>=2 && i<= 20 && j>= 2 && j <=20
                // El código hasta aquí
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
        }
    }

    static void Patron17(){
        int dimension;
        dimension = 21;
        for (int j = 1; j <= dimension; j = j + 1) {
            System.out.println();
            for (int i = 1; i <= dimension; i = i + 1) {

                if (
                // El código desde aqui
                ((i==2 || i == 20)) && ((j!=1 && j!=21)) || ((j==2 || j == 20)) && ((i!=1 && i!=21))
                // El código hasta aquí
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
        }
    }

    static void Patron18(){
        int dimension;
        dimension = 21;
        for (int j = 1; j <= dimension; j = j + 1) {
            System.out.println();
            for (int i = 1; i <= dimension; i = i + 1) {

                if (
                // El código desde aqui
                i<=5 && j<=5
                // El código hasta aquí
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
        }
    }

    static void Patron19(){
        int dimension;
        dimension = 21;
        for (int j = 1; j <= dimension; j = j + 1) {
            System.out.println();
            for (int i = 1; i <= dimension; i = i + 1) {

                if (
                // El código desde aqui
                (i + j) % 2 == 0
                // El código hasta aquí
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
        }
    }

    static void Patron20(){
        int dimension;
        dimension = 21;
        for (int j = 1; j <= dimension; j = j + 1) {
            System.out.println();
            for (int i = 1; i <= dimension; i = i + 1) {

                if (
                // El código desde aqui
              ((i+j)-1) % 4 == 0
                // El código hasta aquí
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
        }
        
    }

    static void Patron21(){
        int dimension;
        dimension = 21;
        for (int j = 1; j <= dimension; j = j + 1) {
            System.out.println();
            for (int i = 1; i <= dimension; i = i + 1) {

                if (
                // El código desde aqui
              (i !=6 || j != 11) 
              && (i!=7 || (j<=8 || j == 11 || j>=14) ) 
              && (i !=16 || j != 11) 
              && (i!=15 || (j<=8 || j == 11 || j>=14))
              && (j !=6 || i != 11) 
              && (j!=7 || (i<=8 || i == 11 || i>=14) ) 
              && (j !=16 || i != 11) 
              && (j!=15 || (i<=8 || i == 11 || i>=14))
              && (j !=8 || i != 8)
              && (j !=8 || i != 14)
              && (j !=14 || i != 8)
              && (j !=14 || i != 14)
                // El código hasta aquí
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }
    }

    static void Espacioentrepatrones(){
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }
}