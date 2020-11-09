public class Principal{
    public static void main(String[] args){

        System.out.println(" aula 28/10 ");

        Moto moto1 = new Moto("honda","titam", 2017 ); 
        moto1.status();
        System.out.println();

        Moto moto2 = new Moto (" Yamaha ","XTZ 150", 2019);
        moto2.status();
        System.out.println();
        
        moto1.setMarca("Yahama");
        moto1.status();

    }

}