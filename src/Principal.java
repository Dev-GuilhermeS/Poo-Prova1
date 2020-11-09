public class Principal {
    public static void main(String[] args) {
        Carro carro = new Carro ("Polo Tsi", "Prata", 2020);
     
         System.out.println(carro.getModelo());
 
        carro.setModelo("Polo Gts");

        System.out.println(carro.getModelo());
        System.out.println(carro.getCor());
        System.out.println(carro.getAno());
    
        Segurança segurança = new Segurança (true, true, true);
        
        System.out.println(segurança.getCinto());
        System.out.println(segurança.getPortas());
        System.out.println(segurança.getFarois());
 
        Status status = new Status (true, "Urbano", "Sem advertencias");
        
        System.out.println(status.getEstado());
        System.out.println(status.getPerimetro());
        System.out.println(status.getVeiculo());
         
  
    }
    
}
