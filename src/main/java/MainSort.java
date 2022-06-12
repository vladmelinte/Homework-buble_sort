import java.util.Arrays;

public class MainSort {
    public static void main(String[] args) {
        SalesDep[] rep;
        rep = new SalesDep[5];
        rep[0] = new SalesDep("John", 5, 300);
        rep[1] = new SalesDep("Albert", 2, 600);
        rep[2] = new SalesDep("Tony", 4, 250);
        rep[3] = new SalesDep("Ginger", 1, 400);
        rep[4] = new SalesDep("Amber", 7, 260);
        SalesDep[] temp;
        temp = new SalesDep[1];

        int n = rep.length;
        int j = 0;
        int g;
        do {
            g=0;
            for(int i=0; i< n-1;i++)
                if (rep[i].count * rep[i].quota < rep[i + 1].count * rep[i+1].quota) {
                    g=1;
                    temp[0]=rep[i];
                    rep[i]=rep[i+1];
                    rep[i+1]=temp[0];
                }


            }while (g!=0);
        for (int i = 0; i <rep.length ; i++) {
            System.out.println(rep[i].name + " " + rep[i].count +" "+rep[i].quota );


        }
    }
}
